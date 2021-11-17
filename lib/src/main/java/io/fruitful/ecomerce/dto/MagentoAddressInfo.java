package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddressInfo {
	private MagentoAddressRequest shippingAddress;
	private MagentoAddressRequest billingAddress;
	private String shippingCarrierCode;
	private String shippingMethodCode;

	@JsonGetter("shipping_address")
	public MagentoAddressRequest getShippingAddress() {
		return shippingAddress;
	}

	@JsonSetter("shippingAddress")
	public void setShippingAddress(MagentoAddressRequest shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@JsonGetter("billing_address")
	public MagentoAddressRequest getBillingAddress() {
		return billingAddress;
	}

	@JsonSetter("billingAddress")
	public void setBillingAddress(MagentoAddressRequest billingAddress) {
		this.billingAddress = billingAddress;
	}

	@JsonGetter("shipping_carrier_code")
	public String getShippingCarrierCode() {
		return shippingCarrierCode;
	}

	@JsonSetter("shippingCarrierCode")
	public void setShippingCarrierCode(String shippingCarrierCode) {
		this.shippingCarrierCode = shippingCarrierCode;
	}

	@JsonGetter("shipping_method_code")
	public String getShippingMethodCode() {
		return shippingMethodCode;
	}

	@JsonSetter("shippingMethodCode")
	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	public MagentoAddressInfo() {
	}

}
