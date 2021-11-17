package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoShippingInfoRequest extends BaseCustomerTokenRequest{
	@JsonProperty("addressInformation")
	private MagentoAddressInfo addressInformation;

	public MagentoAddressInfo getAddressInformation() {
		return addressInformation;
	}

	public void setAddressInformation(MagentoAddressInfo addressInformation) {
		this.addressInformation = addressInformation;
	}

	public MagentoShippingInfoRequest(String bearerToken, Long customerId) {
		super(bearerToken, customerId);
	}
}
