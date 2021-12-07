package io.fruitful.ecomerce.magento;

import io.fruitful.ecomerce.commons.MagentoException;
import io.fruitful.ecomerce.dto.*;
import retrofit2.Response;

import java.util.List;

public interface MagentoCustomer {
    Boolean magentoRemoveItemsCart(RemoveItemCartRequest request) throws MagentoException;

    MagentoCartTotalsResponse magentoGetCartTotals() throws MagentoException;

    MagentoCartResponse magentoGetCurrentCart() throws MagentoException;

    String createCart() throws MagentoException;

    MagentoAddProductToCartResponse magentoAddProductToCart(MagentoAddProductToCartRequest request) throws MagentoException;

    MagentoAddProductToCartResponse magentoUpdateProductCart(MagentoAddProductToCartRequest request) throws MagentoException;

    List<MagentoShippingMethodInfo> estimateShippingMethods(MagentoEstimateShippingRequest request) throws MagentoException;

    MagentoShippingInfo getShippingInfo(MagentoShippingInfoRequest request) throws MagentoException;

    MagentoProduct getProductDetail(MagentoProductDetailRequest request) throws MagentoException;

    boolean addFromCart(MagentoWishlistRequest request) throws MagentoException;

    boolean addFromShop(MagentoWishlistRequest request) throws MagentoException;

    boolean remove(MagentoWishlistRequest request) throws MagentoException;

    MagentoWishlistResponse list(MagentoWishlistRequest request) throws MagentoException;

    boolean moveAllToCart(MagentoWishlistRequest request) throws MagentoException;

    boolean removeAll(MagentoWishlistRequest request) throws MagentoException;

    boolean addToCartFromWishlist(MagentoWishlistRequest request) throws MagentoException;

    Response<Object> customerLogin(MagentoCustomerLoginRequest request) throws MagentoException;

    String getAccessToken(Long customerId) throws MagentoException;
}
