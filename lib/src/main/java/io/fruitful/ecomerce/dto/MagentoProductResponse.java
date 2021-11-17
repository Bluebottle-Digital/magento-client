package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoProductResponse {
	@JsonProperty("items")
	private List<MagentoProduct> items;

	private Long totalCount;

	public MagentoProductResponse() {
	}

	public MagentoProductResponse(List<MagentoProduct> items, Long totalCount) {
		this.items = items;
		this.totalCount = totalCount;
	}

	public MagentoProductResponse(List<MagentoProduct> items) {
		this.items = items;
	}
	
	@JsonGetter("totalCount")
	public Long getTotalCount() {
		return totalCount;
	}

	@JsonSetter("total_count")
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<MagentoProduct> getItems() {
		return items;
	}

	public void setItems(List<MagentoProduct> items) {
		this.items = items;
	}
}
