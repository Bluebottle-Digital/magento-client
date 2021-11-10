package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoCartItem {

	private Long itemId;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("qty")
	private Integer qty;
	@JsonProperty("name")
	private String name;
	@JsonProperty("price")
	private Double price;

	private String productType;

	private String quoteId;
	private MagentoProductOption productOption;

	private MagentoCartProductExtensionAttributes extensionAttributes;

	@JsonGetter("itemId")
	public Long getItemId() {
		return itemId;
	}

	@JsonSetter("item_id")
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@JsonGetter("productType")
	public String getProductType() {
		return productType;
	}
	@JsonSetter("product_type")
	public void setProductType(String productType) {
		this.productType = productType;
	}

	@JsonGetter("quoteId")
	public String getQuoteId() {
		return quoteId;
	}

	@JsonSetter("quote_id")
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	@JsonGetter("extensionAttributes")
	public MagentoCartProductExtensionAttributes getExtensionAttributes() {
		return extensionAttributes;
	}

	@JsonSetter("extension_attributes")
	public void setExtensionAttributes(MagentoCartProductExtensionAttributes extensionAttributes) {
		this.extensionAttributes = extensionAttributes;
	}
}
