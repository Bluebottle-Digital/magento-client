package io.fruitful.ecomerce.proxy;


import io.fruitful.ecomerce.dto.*;
import io.fruitful.ecomerce.enums.SecurityConst;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface MagentoProductApi {

    @GET("rest/V1/products")
    Call<MagentoProductResponse> searchProduct(@QueryMap(encoded = true) Map<String, String> data);

    @GET("rest/V1/categories/list")
    Call<MagentoCategoryResponse> searchCategory(@QueryMap(encoded = true) Map<String, String> data);

    @GET("rest/V1/categories")
    Call<List<MagentoCategoryDto>> getCategory(@QueryMap(encoded = true) Map<String, String> data);

    @PUT("rest/V1/products/{sku}")
    Call<MagentoProduct> updateProduct(@Path(value = "sku", encoded = true) String sku, @Body MagentoProductRequest request);

    @GET("rest/V1/products/{sku}")
    Call<MagentoProduct> getProductDetail(@Path(value = "sku", encoded = true) String sku);
    
    @GET("rest/V1/products/{sku}")
    Call<MagentoProduct> getCustomerProductDetail(@Path(value = "sku", encoded = true) String sku, @Header(SecurityConst.AUTHORIZATION_HEADER) String bearerToken);

    @PUT("rest/V1/clique-api/product/approve")
    Call<List<MagentoApproveProductResponse>> approveProduct(@Body MagentoApproveRejectProductRequest request);

    @PUT("rest/V1/clique-api/product/reject")
    Call<Boolean> rejectProduct(@Body MagentoApproveRejectProductRequest request);

    @GET("rest/V1/clique-api/product")
    Call<MagentoProductResponse> cliqueSearchProduct(@Query("customerId") Long customerId, @QueryMap(encoded = true) Map<String, String> data);
}
