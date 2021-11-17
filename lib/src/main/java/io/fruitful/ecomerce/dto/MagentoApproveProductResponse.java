package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoApproveProductResponse {
	@JsonProperty("talentUserId")
	private String talentUserId;

	@JsonProperty("categoryId")
	private String categoryId;

	public String getTalentUserId() {
		return talentUserId;
	}

	public void setTalentUserId(String talentUserId) {
		this.talentUserId = talentUserId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public MagentoApproveProductResponse() {
	}
}
