package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MagentoCustomerExtensionAttributes {
	@JsonProperty("is_subscribed")
	private Boolean subscribed;

	@JsonProperty("vertex_customer_code")
	private String vertexCustomerCode;

	@JsonProperty("amazon_id")
	private String amazonId;

	@JsonProperty("company_attributes")
	private MagentoCompanyAttribute companyAttribute;

	public Boolean getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}

	public String getVertexCustomerCode() {
		return vertexCustomerCode;
	}

	public void setVertexCustomerCode(String vertexCustomerCode) {
		this.vertexCustomerCode = vertexCustomerCode;
	}

	public String getAmazonId() {
		return amazonId;
	}

	public void setAmazonId(String amazonId) {
		this.amazonId = amazonId;
	}

	public MagentoCompanyAttribute getCompanyAttribute() {
		return companyAttribute;
	}

	public void setCompanyAttribute(MagentoCompanyAttribute companyAttribute) {
		this.companyAttribute = companyAttribute;
	}

	public MagentoCustomerExtensionAttributes() {
	}
}
