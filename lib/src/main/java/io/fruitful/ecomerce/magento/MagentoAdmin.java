package io.fruitful.ecomerce.magento;

import io.fruitful.ecomerce.commons.MagentoException;
import io.fruitful.ecomerce.dto.*;

import java.util.List;

public interface MagentoAdmin {

    MagentoProductResponse searchProduct(Long customerId, MagentoProductSearchRequest request) throws MagentoException;

    List<MagentoCategoryDto> getCategory(Long rootCategoryId) throws MagentoException;

    MagentoCategoryResponse listCategory(MagentoCategorySearchRequest request) throws MagentoException;

    boolean updateProduct(MagentoProductRequest request) throws MagentoException;

    MagentoProduct getProductDetail(MagentoProductDetailRequest request) throws MagentoException;

    List<MagentoApproveProductResponse> approveProduct(MagentoApproveRejectProductRequest request) throws MagentoException;

    boolean rejectProduct(MagentoApproveRejectProductRequest request) throws MagentoException;

    MagentoCustomerResponse createCustomer(MagentoCustomerRequest request) throws MagentoException;

    String getAccessToken(Long customerId) throws MagentoException;

    List<MagentoCountry> getCountries() throws MagentoException;

    MagentoCountryDetail getCountryDetail(String countryId) throws MagentoException;
}
