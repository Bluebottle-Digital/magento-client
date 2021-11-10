package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoEstimateShippingRequest extends BaseCustomerTokenRequest{

	@JsonProperty("address")
	private MagentoAddressDto address;
}
