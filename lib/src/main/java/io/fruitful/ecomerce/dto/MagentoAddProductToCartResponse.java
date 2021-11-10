package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddProductToCartResponse {

	private Integer itemId;

	private String sku;

	private Integer qty;

	private String name;

	private Double price;

	private String productType;

	private String quoteId;

	@JsonSetter("item_id")
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@JsonSetter("product_type")
	public void setProductType(String productType) {
		this.productType = productType;
	}

	@JsonSetter("quote_id")
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	@JsonGetter("itemId")
	public Integer getItemId() {
		return itemId;
	}

	@JsonGetter("productType")
	public String getProductType() {
		return productType;
	}

	@JsonGetter("quoteId")
	public String getQuoteId() {
		return quoteId;
	}
}
