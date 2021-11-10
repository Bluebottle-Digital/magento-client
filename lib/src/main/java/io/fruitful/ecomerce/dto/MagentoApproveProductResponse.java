package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoApproveProductResponse {
	@JsonProperty("talentUserId")
	private String talentUserId;

	@JsonProperty("categoryId")
	private String categoryId;
}
