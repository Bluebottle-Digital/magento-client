package io.fruitful.ecomerce;

import io.fruitful.ecomerce.commons.MagentoException;
import io.fruitful.ecomerce.dto.*;

import java.util.List;

public interface Magento {

    Boolean magentoRemoveItemsCart(RemoveItemCartRequest request) throws MagentoException;

    MagentoCartTotalsResponse magentoGetCartTotals(BaseCustomerTokenRequest request) throws MagentoException;

    MagentoCartResponse magentoGetCurrentCart(BaseCustomerTokenRequest request) throws MagentoException;

    String createCart() throws MagentoException;

    MagentoAddProductToCartResponse magentoAddProductToCart(MagentoAddProductToCartRequest request) throws MagentoException;

    MagentoAddProductToCartResponse magentoUpdateProductCart(MagentoAddProductToCartRequest request) throws MagentoException;

    List<MagentoCountry> getCountries() throws MagentoException;

    MagentoCountryDetail getCountryDetail(String countryId) throws MagentoException;

    List<MagentoShippingMethodInfo> estimateShippingMethods(MagentoEstimateShippingRequest request) throws MagentoException;

    MagentoShippingInfo getShippingInfo(MagentoShippingInfoRequest request) throws MagentoException;


    MagentoProductResponse searchProduct(Long customerId, MagentoProductSearchRequest request) throws MagentoException;

    List<MagentoCategoryDto> getCategory(Long rootCategoryId) throws MagentoException;

    MagentoCategoryResponse listCategory(MagentoCategorySearchRequest request) throws MagentoException;

    boolean updateProduct(MagentoProductRequest request) throws MagentoException;

    MagentoProduct getProductDetail(MagentoProductDetailRequest request) throws MagentoException;

    List<MagentoApproveProductResponse> approveProduct(MagentoApproveRejectProductRequest request) throws MagentoException;

    boolean rejectProduct(MagentoApproveRejectProductRequest request) throws MagentoException;


    boolean addFromCart(MagentoWishlistRequest request) throws MagentoException;

    boolean addFromShop(MagentoWishlistRequest request) throws MagentoException;

    boolean remove(MagentoWishlistRequest request) throws MagentoException;

    MagentoWishlistResponse list(MagentoWishlistRequest request) throws MagentoException;

    boolean moveAllToCart(MagentoWishlistRequest request) throws MagentoException;

    boolean removeAll(MagentoWishlistRequest request) throws MagentoException;

    boolean addToCartFromWishlist(MagentoWishlistRequest request) throws MagentoException;
}
