package io.fruitful.ecomerce.proxy;

import io.fruitful.ecomerce.dto.MagentoCustomer;
import io.fruitful.ecomerce.dto.MagentoCustomerLoginRequest;
import io.fruitful.ecomerce.dto.MagentoCustomerRequest;
import io.fruitful.ecomerce.enums.SecurityConst;
import retrofit2.Call;
import retrofit2.http.*;

public interface MagentoCustomerApi {
	@POST("rest/default/V1/customers")
	Call<MagentoCustomer> createCustomer(@Body MagentoCustomerRequest request);
	
	@GET("rest/V1/clique-api/customer-token")
	Call<String> getAccessToken(@Query("customerId") Long customerId);

	@POST("customeraccount/customer_ajax/login")
	Call<Object> customerLogin(@Header(SecurityConst.X_REQUESTED_WITH) String xRequestWith, @Body MagentoCustomerLoginRequest request);
}
