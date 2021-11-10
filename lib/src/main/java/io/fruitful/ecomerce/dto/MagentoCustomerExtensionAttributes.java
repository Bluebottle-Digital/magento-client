package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
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
}
