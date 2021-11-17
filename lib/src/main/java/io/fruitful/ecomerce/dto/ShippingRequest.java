package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ShippingRequest {
	private Double amount;
	private Boolean available;
	private Double baseAmount;
	private String carrierCode;
	private String carrierTitle;
	private String errorMessage;
	private String methodCode;
	private String methodTitle;
	private Double priceExclTax;
	private Double priceInclTax;
	private ExtensionAttributes extensionAttributes;

	@JsonGetter("base_amount")
	public Double getBaseAmount() {
		return baseAmount;
	}

	@JsonSetter("baseAmount")
	public void setBaseAmount(Double baseAmount) {
		this.baseAmount = baseAmount;
	}

	@JsonGetter("carrier_code")
	public String getCarrierCode() {
		return carrierCode;
	}

	@JsonSetter("carrierCode")
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	@JsonGetter("carrier_title")
	public String getCarrierTitle() {
		return carrierTitle;
	}

	@JsonSetter("carrierTitle")
	public void setCarrierTitle(String carrierTitle) {
		this.carrierTitle = carrierTitle;
	}

	@JsonGetter("error_message")
	public String getErrorMessage() {
		return errorMessage;
	}

	@JsonSetter("errorMessage")
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@JsonGetter("method_code")
	public String getMethodCode() {
		return methodCode;
	}

	@JsonSetter("methodCode")
	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	@JsonGetter("method_title")
	public String getMethodTitle() {
		return methodTitle;
	}

	@JsonSetter("methodTitle")
	public void setMethodTitle(String methodTitle) {
		this.methodTitle = methodTitle;
	}

	@JsonGetter("price_excl_tax")
	public Double getPriceExclTax() {
		return priceExclTax;
	}

	@JsonSetter("priceExclTax")
	public void setPriceExclTax(Double priceExclTax) {
		this.priceExclTax = priceExclTax;
	}

	@JsonGetter("price_incl_tax")
	public Double getPriceInclTax() {
		return priceInclTax;
	}

	@JsonSetter("priceInclTax")
	public void setPriceInclTax(Double priceInclTax) {
		this.priceInclTax = priceInclTax;
	}

	@JsonGetter("extension_attributes")
	public ExtensionAttributes getExtensionAttributes() {
		return extensionAttributes;
	}

	@JsonSetter("extensionAttributes")
	public void setExtensionAttributes(ExtensionAttributes extensionAttributes) {
		this.extensionAttributes = extensionAttributes;
	}

	public ShippingRequest() {
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public class ExtensionAttributes {
		private Long locationId;
		private Long vendorId;

		@JsonGetter("location_id")
		public Long getLocationId() {
			return locationId;
		}

		@JsonSetter("locationId")
		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		@JsonGetter("vendor_id")
		public Long getVendorId() {
			return vendorId;
		}

		@JsonSetter("vendorId")
		public void setVendorId(Long vendorId) {
			this.vendorId = vendorId;
		}

		public ExtensionAttributes() {
		}
	}
}
