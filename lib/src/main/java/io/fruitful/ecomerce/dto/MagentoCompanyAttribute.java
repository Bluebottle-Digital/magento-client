package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoCompanyAttribute {

	@JsonProperty("customer_id")
	private Integer customerId;

	@JsonProperty("company_id")
	private Integer companyId;

	@JsonProperty("job_title")
	private Integer jobTitle;

	@JsonProperty("status")
	private Integer status;

	@JsonProperty("telephone")
	private Integer telephone;

	@JsonProperty("extension_attributes")
	private MagentoExtensionAttributes extensionAttributes;
}
