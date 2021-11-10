package io.fruitful.ecomerce.proxy;


import io.fruitful.ecomerce.dto.*;
import io.fruitful.ecomerce.enums.SecurityConst;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface MagentoCartApi {

    @POST("rest/V1/carts/mine")
    Call<String> createCart(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken);

    @GET("rest/V1/carts/mine")
    Call<MagentoCartResponse> getCurrentCart(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken);

    @POST("rest/V1/carts/mine/items")
    Call<MagentoAddProductToCartResponse> addProductToCart(@Header(SecurityConst.AUTHORIZATION_HEADER)  String bearerToken, @Body MagentoAddProductToCartRequest request);

    @DELETE("rest/V1/carts/mine/items/{itemId}")
    Call<Boolean> removeItemsCart(@Header(SecurityConst.AUTHORIZATION_HEADER)  String bearerToken, @Path("itemId") Long itemId);

    @GET("rest/V1/carts/mine/totals")
    Call<MagentoCartTotalsResponse> getCartTotals(@Header(SecurityConst.AUTHORIZATION_HEADER)  String bearerToken);

    @PUT("rest/V1/carts/mine/items/{itemId}")
    Call<MagentoAddProductToCartResponse> updateProductCart(@Header(SecurityConst.AUTHORIZATION_HEADER)  String bearerToken, @Path("itemId") Long itemId, @Body MagentoAddProductToCartRequest request);

    @GET("rest/V1/directory/countries")
    Call<List<MagentoCountry>> getCountries();

    @GET("rest/V1/directory/countries/{countryId}")
    Call<MagentoCountryDetail> getCountryDetail(@Path("countryId") String countryId);

    @POST("rest/default/V1/carts/mine/estimate-shipping-methods")
    Call<List<MagentoShippingMethodInfo>> estimateShippingMethods(@Header(SecurityConst.AUTHORIZATION_HEADER) String token, @Body MagentoEstimateShippingRequest request);

    @POST("rest/default/V1/carts/mine/shipping-information")
    Call<MagentoShippingInfo> getShippingInfo(@Header(SecurityConst.AUTHORIZATION_HEADER) String token, @Body MagentoShippingInfoRequest request);
}
