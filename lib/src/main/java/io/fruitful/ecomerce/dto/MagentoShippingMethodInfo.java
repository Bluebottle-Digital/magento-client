package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoShippingMethodInfo {
	private String carrierCode;

	private String methodCode;

	private String carrierTitle;

	private String methodTitle;

	@JsonProperty("amount")
	private Double amount;

	private Double baseAmount;

	@JsonProperty("available")
	private boolean available;

	private VendorAttribute extensionAttributes;

	private String errorMessage;

	private Double priceExcludeTax;

	private Double priceIncludeTax;

	@JsonGetter("carrierCode")
	public String getCarrierCode() {
		return carrierCode;
	}

	@JsonSetter("carrier_code")
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	@JsonGetter("methodCode")
	public String getMethodCode() {
		return methodCode;
	}

	@JsonSetter("method_code")
	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	@JsonGetter("carrierTitle")
	public String getCarrierTitle() {
		return carrierTitle;
	}

	@JsonSetter("carrier_title")
	public void setCarrierTitle(String carrierTitle) {
		this.carrierTitle = carrierTitle;
	}

	@JsonGetter("methodTitle")
	public String getMethodTitle() {
		return methodTitle;
	}

	@JsonSetter("method_title")
	public void setMethodTitle(String methodTitle) {
		this.methodTitle = methodTitle;
	}

	@JsonGetter("baseAmount")
	public Double getBaseAmount() {
		return baseAmount;
	}

	@JsonSetter("base_amount")
	public void setBaseAmount(Double baseAmount) {
		this.baseAmount = baseAmount;
	}

	@JsonGetter("extensionAttributes")
	public VendorAttribute getExtensionAttributes() {
		return extensionAttributes;
	}

	@JsonSetter("extension_attributes")
	public void setExtensionAttributes(VendorAttribute extensionAttributes) {
		this.extensionAttributes = extensionAttributes;
	}

	@JsonGetter("errorMessage")
	public String getErrorMessage() {
		return errorMessage;
	}

	@JsonSetter("error_message")
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@JsonGetter("priceExcludeTax")
	public Double getPriceExcludeTax() {
		return priceExcludeTax;
	}

	@JsonSetter("price_excl_tax")
	public void setPriceExcludeTax(Double priceExcludeTax) {
		this.priceExcludeTax = priceExcludeTax;
	}

	@JsonGetter("priceIncludeTax")
	public Double getPriceIncludeTax() {
		return priceIncludeTax;
	}

	@JsonSetter("price_incl_tax")
	public void setPriceIncludeTax(Double priceIncludeTax) {
		this.priceIncludeTax = priceIncludeTax;
	}
}
