package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(Integer jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public MagentoExtensionAttributes getExtensionAttributes() {
		return extensionAttributes;
	}

	public void setExtensionAttributes(MagentoExtensionAttributes extensionAttributes) {
		this.extensionAttributes = extensionAttributes;
	}

	public MagentoCompanyAttribute() {
	}
}
