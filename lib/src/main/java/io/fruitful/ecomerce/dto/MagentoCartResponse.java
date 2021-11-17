package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoCartResponse {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("items")
	private List<MagentoCartItem> items;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<MagentoCartItem> getItems() {
		return items;
	}

	public void setItems(List<MagentoCartItem> items) {
		this.items = items;
	}

	public MagentoCartResponse() {
	}
}
