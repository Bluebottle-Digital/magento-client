package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoCategoryResponse {
	@JsonProperty("items")
	private List<MagentoCategory> items;

	private Long totalCount;

	@JsonGetter("totalCount")
	public Long getTotalCount() {
		return totalCount;
	}

	@JsonSetter("total_count")
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
}
