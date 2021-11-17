package io.fruitful.ecomerce.magento;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import io.fruitful.ecomerce.Configuration;
import io.fruitful.ecomerce.commons.MagentoErrorInfo;
import io.fruitful.ecomerce.commons.MagentoException;
import io.fruitful.ecomerce.dto.*;
import io.fruitful.ecomerce.proxy.*;
import io.fruitful.ecomerce.utils.RetrofitService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Response;

import java.util.*;
import java.util.stream.Collectors;

public class MagentoAdminImpl implements MagentoAdmin {

    private static final Logger log = LoggerFactory.getLogger(MagentoAdminImpl.class);
    private final Configuration conf;
    private MagentoCustomerApi magentoCustomerApi;

    //for admin and talent using integration token
    private MagentoProductApi magentoProductApi;

    public MagentoAdminImpl(Configuration conf) {
        this.conf = conf;
        this.init();
    }

    public void init() {
        String integrationToken = conf.getIntegrationToken();
        String endpoint = conf.getEndpoint();
        magentoCustomerApi = RetrofitService.createService(MagentoCustomerApi.class, new MagentoInterceptor(integrationToken), endpoint);
        magentoProductApi = RetrofitService.createService(MagentoProductApi.class, new MagentoInterceptor(integrationToken), endpoint);
    }

    @Override
    public MagentoProductResponse searchProduct(Long customerId, MagentoProductSearchRequest request) throws MagentoException {
        Map<String, String> searchCriteria = this.buildProductCriteria(request);

        if (searchCriteria.isEmpty())
            return new MagentoProductResponse();

        Response<MagentoProductResponse> response;
        try {
            response = this.magentoProductApi.cliqueSearchProduct(customerId, searchCriteria).execute();
        } catch (Exception ex) {
            log.error("searchProduct error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }

        MagentoProductResponse data = RetrofitService.getData(response);
        if (data == null)
            return new MagentoProductResponse();

        this.fixProductMediaUrl(data.getItems());

        return data;
    }

    @Override
    public List<MagentoCategoryDto> getCategory(Long rootCategoryId) throws MagentoException {
        Map<String, String> criteria = new HashMap<>();
        if (rootCategoryId == null) rootCategoryId = conf.getDefaultCategoryId();
        criteria.put(MagentoConst.ROOT_CATEGORY_ID, rootCategoryId.toString());

        Response<List<MagentoCategoryDto>> response;
        try {
            response = this.magentoProductApi.getCategory(criteria).execute();
        } catch (Exception ex) {
            log.error("searchProduct error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoCategoryResponse listCategory(MagentoCategorySearchRequest request) throws MagentoException {
        Map<String, String> criteria = this.buildCategoryCriteria(request);

        Response<MagentoCategoryResponse> response;
        try {
            response = this.magentoProductApi.searchCategory(criteria).execute();
        } catch (Exception ex) {
            log.error("searchProduct error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public boolean updateProduct(MagentoProductRequest request) throws MagentoException {
        Response<MagentoProduct> response;
        try {
            response = this.magentoProductApi.updateProduct(request.getProduct().getSku(), request).execute();
        } catch (Exception ex) {
            log.error("updateProduct error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        RetrofitService.getData(response);
        return true;
    }

    @Override
    public MagentoProduct getProductDetail(MagentoProductDetailRequest request) throws MagentoException {
        Response<MagentoProduct> response;
        try {
            response = this.magentoProductApi
                    .getProductDetail(request.getSku())
                    .execute();

        } catch (Exception ex) {
            log.error("getProductDetail error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }

        MagentoProduct data = RetrofitService.getData(response);
        this.fixProductMediaUrl(Collections.singleton(data));
        return data;
    }

    private void fixProductMediaUrl(Collection<MagentoProduct> products) {
        for (MagentoProduct p : products) {
            for (MagentoMediaDto m : p.getMedias()) {
                if (!StringUtils.isEmpty(m.getFileUrl()) && !(m.getFileUrl().contains("http://") || m.getFileUrl().contains("https://"))) {
                    m.setFileUrl(this.conf.getEndpoint() + this.conf.getMediaLocation() + m.getFileUrl());
                }
            }
        }
    }

    private Map<String, String> buildCategoryCriteria(MagentoCategorySearchRequest request) throws MagentoException {
        Map<String, String> criteria = new LinkedHashMap<>();

        if (!StringUtils.isEmpty(request.getKeyword())) {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 0, 0), MagentoConst.NAME);
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 0, 0), "%25" + request.getKeyword().trim() + "%25");
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 0, 0), MagentoConst.LIKE);
        }

        if (request.getIsActive() != null) {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 1, 0), MagentoConst.IS_ACTIVE);
            Integer v = MagentoConst.ACTIVE.equals(request.getIsActive()) ? MagentoConst.ACTIVE : MagentoConst.INACTIVE;
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 1, 0), v.toString());
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 1, 0), MagentoConst.EQ);
        }

        Long parentId = request.getParentId() != null ? request.getParentId() : conf.getDefaultCategoryId();

        if (request.getIncludeSubChildren() != null && request.getIncludeSubChildren()) {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 2, 0), MagentoConst.PATH);
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 2, 0), "%25" + parentId + "/%25");
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 2, 0), MagentoConst.LIKE);
        } else {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 2, 0), MagentoConst.PARENT_ID);
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 2, 0), parentId.toString());
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 2, 0), MagentoConst.EQ);
        }

        return criteria;
    }

    private Map<String, String> buildProductCriteria(MagentoProductSearchRequest request) throws MagentoException {

        Map<String, String> criteria = new LinkedHashMap<>();
        String talentField = MagentoConst.APPROVE_STATUS.equals(request.getApprovalStatus()) ? MagentoConst.CATEGORY_ID : MagentoConst.PRODUCT_TALENT;
        String talentConditionType = MagentoConst.APPROVE_STATUS.equals(request.getApprovalStatus()) ? MagentoConst.IN : MagentoConst.EQ;

        if (!CollectionUtils.isEmpty(request.getUserIds())) {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 0, 0), talentField);
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 0, 0), String.join(",", request.getUserIds()));
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 0, 0), talentConditionType);
        } else {
            // Admin not request filter talentUserId -> query by approve status
            int value = MagentoConst.APPROVE_STATUS.equals(request.getApprovalStatus()) ? 1 : 0;
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 0, 0), MagentoConst.APPROVE);
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 0, 0), Integer.toString(value));
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 0, 0), MagentoConst.EQ);
        }

        if (!CollectionUtils.isEmpty(request.getCategoryIds())) {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 1, 0), MagentoConst.CATEGORY_ID);
            Set<String> categoryIds = request.getCategoryIds().stream().map(Objects::toString).collect(Collectors.toSet());
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 1, 0), String.join(",", categoryIds));
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 1, 0), MagentoConst.IN);
        }

        if (!StringUtils.isEmpty(request.getKeyword())) {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 2, 0), MagentoConst.NAME);
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 2, 0), "%25" + request.getKeyword().trim() + "%25");
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 2, 0), MagentoConst.LIKE);
        }

        if (request.getStatus() != null) {
            criteria.put(String.format(MagentoConst.FILTER_FIELD, 3, 0), MagentoConst.STATUS);
            String status = request.getStatus().equals(MagentoConst.ENABLE) ? MagentoConst.ENABLE.toString() : MagentoConst.DISABLE.toString();
            criteria.put(String.format(MagentoConst.FILTER_VALUE, 3, 0), status);
            criteria.put(String.format(MagentoConst.FILTER_TYPE, 3, 0), MagentoConst.EQ);
        }

//        if (request.getStockStatus() != null) {
//            searchCriteria.put(String.format(FILTER_FIELD, 4, 0), QTY);
//            String type = request.getStockStatus().equals(IN_STOCK) ? LTEQ : GT;
//            searchCriteria.put(String.format(FILTER_VALUE, 4, 0), "0");
//            searchCriteria.put(String.format(FILTER_TYPE, 4, 0), type);
//        }

        if (!StringUtils.isEmpty(request.getOrderBy()) && !StringUtils.isEmpty(request.getOrderDirection())) {

            criteria.put(String.format(MagentoConst.SORT_FIELD, 0), request.getOrderBy());
            String direction = request.getOrderDirection().equalsIgnoreCase(MagentoConst.DESC) ? MagentoConst.DESC : MagentoConst.ASC;
            criteria.put(String.format(MagentoConst.SORT_DIRECTION, 0), direction);
            if (request.getOrderBy().equalsIgnoreCase(MagentoConst.CREATED_AT)) {
                criteria.put(String.format(MagentoConst.SORT_FIELD, 1), MagentoConst.CREATED_AT);
                criteria.put(String.format(MagentoConst.SORT_DIRECTION, 1), MagentoConst.DESC);
            }

            if (request.getOrderBy().equalsIgnoreCase(MagentoConst.PRICE)) {
                criteria.put(String.format(MagentoConst.SORT_FIELD, 10), MagentoConst.PRICE);
                criteria.put(String.format(MagentoConst.SORT_DIRECTION, 10), MagentoConst.ASC);
            }

        } else {
            criteria.put(String.format(MagentoConst.SORT_FIELD, 1), MagentoConst.CREATED_AT);
            criteria.put(String.format(MagentoConst.SORT_DIRECTION, 1), MagentoConst.DESC);

            criteria.put(String.format(MagentoConst.SORT_FIELD, 10), MagentoConst.PRICE);
            criteria.put(String.format(MagentoConst.SORT_DIRECTION, 10), MagentoConst.ASC);

        }

        if (request.getPageIndex() != null && request.getPageSize() != null) {
            criteria.put(MagentoConst.PAGING_SIZE, String.valueOf(request.getPageSize()));
            criteria.put(MagentoConst.PAGING_INDEX, String.valueOf(request.getPageIndex()));
        }

        return criteria;
    }

    @Override
    public List<MagentoApproveProductResponse> approveProduct(MagentoApproveRejectProductRequest request) throws MagentoException {
        Response<List<MagentoApproveProductResponse>> response;
        try {
            response = this.magentoProductApi.approveProduct(request).execute();
        } catch (Exception ex) {
            log.error("approveProduct error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public boolean rejectProduct(MagentoApproveRejectProductRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoProductApi.rejectProduct(request).execute();
        } catch (Exception ex) {
            log.error("rejectProduct error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }
}
