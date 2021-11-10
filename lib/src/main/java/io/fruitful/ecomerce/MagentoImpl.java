package io.fruitful.ecomerce;

import io.fruitful.ecomerce.commons.MagentoErrorInfo;
import io.fruitful.ecomerce.commons.MagentoException;
import io.fruitful.ecomerce.dto.*;
import io.fruitful.ecomerce.proxy.*;
import io.fruitful.ecomerce.utils.RetrofitService;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import retrofit2.Response;

import java.util.*;
import java.util.stream.Collectors;

@Data
@Log4j2
public class MagentoImpl implements Magento {
    private Configuration conf;
    private String customerToken;
    private MagentoCustomerApi magentoCustomerApi;

    //for admin and talent using integration token
    private MagentoProductApi magentoProductApi;

    //for customer using customer token.
    private MagentoProductApi magentoCustomerProductApi;
    private MagentoWishlistApi magentoWishlistApi;
    private MagentoCartApi magentoCartApi;

    public MagentoImpl(Configuration conf, String customerToken) {
        this.conf = conf;
        this.customerToken = customerToken;
        this.init();
    }

    public MagentoImpl(Configuration conf) {
        this.conf = conf;
        this.init();
    }

    public void init() {
        String integrationToken = conf.getIntegrationToken();
        String endpoint = conf.getEndpoint();
        magentoCustomerApi = RetrofitService.createService(MagentoCustomerApi.class, new MagentoInterceptor(integrationToken), endpoint);
        magentoProductApi = RetrofitService.createService(MagentoProductApi.class, new MagentoInterceptor(integrationToken), endpoint);

        MagentoInterceptor customerInterceptor = null;
        if (!StringUtils.isEmpty(customerToken)) {
            customerInterceptor = new MagentoInterceptor(customerToken);
        }
        magentoCustomerProductApi = RetrofitService.createService(MagentoProductApi.class, customerInterceptor, endpoint);
        magentoWishlistApi = RetrofitService.createService(MagentoWishlistApi.class, customerInterceptor, endpoint);
        magentoCartApi = RetrofitService.createService(MagentoCartApi.class, customerInterceptor, endpoint);

    }

    @Override
    public Boolean magentoRemoveItemsCart(RemoveItemCartRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoCartApi.removeItemsCart(this.customerToken, request.getItemId()).execute();
        } catch (Exception ex) {
            log.error("removeItemsCart error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoCartTotalsResponse magentoGetCartTotals(BaseCustomerTokenRequest request) throws MagentoException {
        Response<MagentoCartTotalsResponse> response;
        try {
            response = this.magentoCartApi.getCartTotals(this.customerToken).execute();
        } catch (Exception ex) {
            log.error("getCartTotals error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoCartResponse magentoGetCurrentCart(BaseCustomerTokenRequest request) throws MagentoException {
        Response<MagentoCartResponse> response;
        try {
            response = this.magentoCartApi.getCurrentCart(this.customerToken).execute();
        } catch (Exception ex) {
            log.error("getCurrentCart error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public String createCart() throws MagentoException {
        Response<String> response;
        try {
            response = this.magentoCartApi.createCart(this.customerToken).execute();
        } catch (Exception ex) {
            log.error("createCart error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoAddProductToCartResponse magentoAddProductToCart(MagentoAddProductToCartRequest request) throws MagentoException {
        Response<MagentoAddProductToCartResponse> response;
        try {
            response = this.magentoCartApi.addProductToCart(this.customerToken, request).execute();
        } catch (Exception ex) {
            log.error("addProductToCart error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoAddProductToCartResponse magentoUpdateProductCart(MagentoAddProductToCartRequest request) throws MagentoException {
        Response<MagentoAddProductToCartResponse> response;
        try {
            response = this.magentoCartApi.updateProductCart(this.customerToken, request.getCartItem().getItemId(), request).execute();
        } catch (Exception ex) {
            log.error("addProductToCart error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);

    }

    @Override
    public List<MagentoCountry> getCountries() throws MagentoException {
        Response<List<MagentoCountry>> response;
        try {
            response = this.magentoCartApi.getCountries().execute();
        } catch (Exception ex) {
            log.error("Get countries error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoCountryDetail getCountryDetail(String countryId) throws MagentoException {
        Response<MagentoCountryDetail> response;
        try {
            response = this.magentoCartApi.getCountryDetail(countryId).execute();
        } catch (Exception ex) {
            log.error("Get countries error ", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public List<MagentoShippingMethodInfo> estimateShippingMethods(MagentoEstimateShippingRequest request) throws MagentoException {
        Response<List<MagentoShippingMethodInfo>> response;
        try {
            response = this.magentoCartApi.estimateShippingMethods(this.customerToken, request).execute();
        } catch (Exception ex) {
            log.error("Estimate shipping methods failed.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoShippingInfo getShippingInfo(MagentoShippingInfoRequest request) throws MagentoException {
        Response<MagentoShippingInfo> response;
        try {
            response = this.magentoCartApi.getShippingInfo(this.customerToken, request).execute();
        } catch (Exception ex) {
            log.error("Get shipping information failed.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
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
            if (!StringUtils.isEmpty(this.customerToken)) {
                response = this.magentoCustomerProductApi
                        .getCustomerProductDetail(request.getSku(), this.customerToken)
                        .execute();
            } else {
                response = this.magentoCustomerProductApi
                        .getProductDetail(request.getSku())
                        .execute();
            }


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


    @Override
    public boolean addFromCart(MagentoWishlistRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoWishlistApi.addFromCart(this.customerToken, request).execute();
        } catch (Exception ex) {
            log.error("Error was occurred when add product to from cart to wish list.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public boolean addFromShop(MagentoWishlistRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoWishlistApi.addFromShop(this.customerToken, request).execute();
        } catch (Exception ex) {
            log.error("Error was occurred when add product from shop page to wish list.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public boolean remove(MagentoWishlistRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoWishlistApi.remove(this.customerToken, request.getSku()).execute();
        } catch (Exception ex) {
            log.error("Error was occurred when remove product from wish list.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public MagentoWishlistResponse list(MagentoWishlistRequest request) throws MagentoException {
        Response<MagentoProductResponse> response;
        try {
            response = this.magentoWishlistApi.list(this.customerToken).execute();
        } catch (Exception ex) {
            log.error("Error was occurred when displaying wish list.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        MagentoProductResponse data = RetrofitService.getData(response);
        MagentoWishlistResponse wishlistResponse = new MagentoWishlistResponse();
        wishlistResponse.setItems(data != null ? data.getItems() : new ArrayList<>());
        wishlistResponse.setTotalCount(data != null ? data.getTotalCount() : 0);
        return wishlistResponse;
    }

    @Override
    public boolean moveAllToCart(MagentoWishlistRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoWishlistApi.moveAllToCart(this.customerToken).execute();
        } catch (Exception ex) {
            log.error("Error was occurred when move all wishlist items to cart.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public boolean removeAll(MagentoWishlistRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoWishlistApi.removeAll(this.customerToken).execute();
        } catch (Exception ex) {
            log.error("Error was occurred when remove all wishlist items.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }

    @Override
    public boolean addToCartFromWishlist(MagentoWishlistRequest request) throws MagentoException {
        Response<Boolean> response;
        try {
            response = this.magentoWishlistApi.addToCartFromWishlist(this.customerToken, request).execute();
        } catch (Exception ex) {
            log.error("Error was occurred while add product to cart from wishlist.", ex);
            throw new MagentoException(MagentoErrorInfo.MAGENTO_CUSTOM_ERROR_CODE, ex.getMessage());
        }
        return RetrofitService.getData(response);
    }
}
