package io.fruitful.ecomerce.proxy;

import io.fruitful.ecomerce.dto.MagentoProductResponse;
import io.fruitful.ecomerce.dto.MagentoWishlistRequest;
import io.fruitful.ecomerce.enums.SecurityConst;
import retrofit2.Call;
import retrofit2.http.*;

public interface MagentoWishlistApi {

    @POST("rest/V1/clique-api/wishlist/cart")
    Call<Boolean> addFromCart(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken, @Body MagentoWishlistRequest request);
    
    @POST("rest/V1/clique-api/wishlist/shop")
    Call<Boolean> addFromShop(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken, @Body MagentoWishlistRequest request);
    
    @DELETE("rest/V1/clique-api/wishlist/{sku}")
    Call<Boolean> remove(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken, @Path(value = "sku", encoded = true) String sku);
    
    @GET("rest/V1/clique-api/wishlist/list")
    Call<MagentoProductResponse> list(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken);
    
    @POST("rest/V1/clique-api/wishlist/all")
    Call<Boolean> moveAllToCart(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken);
    
    @DELETE("rest/V1/clique-api/wishlist/all")
    Call<Boolean> removeAll(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken);
    
    @POST("rest/V1/clique-api/wishlist")
    Call<Boolean> addToCartFromWishlist(@Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken, @Body MagentoWishlistRequest request);
}
