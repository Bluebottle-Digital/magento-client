package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoEstimateShippingRequest {

	@JsonProperty("address")
	private MagentoAddressDto address;

	public MagentoAddressDto getAddress() {
		return address;
	}

	public void setAddress(MagentoAddressDto address) {
		this.address = address;
	}

	public MagentoEstimateShippingRequest() {
	}
}
