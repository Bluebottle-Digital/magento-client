package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoTotalItem {
	private Long itemId;
	@JsonProperty("price")
	private Double price;
	private Double quantity;
	private Double basePrice;
	private Integer rowTotal;
	private Integer rowTotalWithDiscount;
	private Double taxAmount;
	private Double baseTaxAmount;
	private Double taxPercent;
	private Double discountAmount;
	private Double baseDiscountAmount;
	private Integer discountPercent;
	private Double priceIncludeTax;
	private Double basePriceIncludeTax;
	private Integer rowTotalIncludeTax;
	private Integer baseRowTotalIncludeTax;
	private Double weeeTaxAppliedAmount;
	private Double weeeTaxApplied;
	@JsonProperty("name")
	private String name;
	@JsonProperty("options")
	private Object options;

	@JsonGetter("itemId")
	public Long getItemId() {
		return itemId;
	}

	@JsonSetter("item_id")
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	@JsonGetter("basePrice")
	public Double getBasePrice() {
		return basePrice;
	}
	@JsonSetter("base_price")
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	@JsonGetter("rowTotal")
	public Integer getRowTotal() {
		return rowTotal;
	}
	@JsonSetter("row_total")
	public void setRowTotal(Integer rowTotal) {
		this.rowTotal = rowTotal;
	}
	@JsonGetter("rowTotalWithDiscount")
	public Integer getRowTotalWithDiscount() {
		return rowTotalWithDiscount;
	}
	@JsonSetter("row_total_with_discount")
	public void setRowTotalWithDiscount(Integer rowTotalWithDiscount) {
		this.rowTotalWithDiscount = rowTotalWithDiscount;
	}
	@JsonGetter("taxAmount")
	public Double getTaxAmount() {
		return taxAmount;
	}
	@JsonSetter("tax_amount")
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	@JsonGetter("baseTaxAmount")
	public Double getBaseTaxAmount() {
		return baseTaxAmount;
	}
	@JsonSetter("base_tax_amount")
	public void setBaseTaxAmount(Double baseTaxAmount) {
		this.baseTaxAmount = baseTaxAmount;
	}
	@JsonGetter("taxPercent")
	public Double getTaxPercent() {
		return taxPercent;
	}
	@JsonSetter("tax_percent")
	public void setTaxPercent(Double taxPercent) {
		this.taxPercent = taxPercent;
	}
	@JsonGetter("discountAmount")
	public Double getDiscountAmount() {
		return discountAmount;
	}
	@JsonSetter("discount_amount")
	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}
	@JsonGetter("baseDiscountAmount")
	public Double getBaseDiscountAmount() {
		return baseDiscountAmount;
	}
	@JsonSetter("base_discount_amount")
	public void setBaseDiscountAmount(Double baseDiscountAmount) {
		this.baseDiscountAmount = baseDiscountAmount;
	}
	@JsonGetter("discountPercent")
	public Integer getDiscountPercent() {
		return discountPercent;
	}
	@JsonSetter("discount_percent")
	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}

	@JsonGetter("priceIncludeTax")
	public Double getPriceIncludeTax() {
		return priceIncludeTax;
	}
	@JsonSetter("price_include_tax")
	public void setPriceIncludeTax(Double priceIncludeTax) {
		this.priceIncludeTax = priceIncludeTax;
	}
	@JsonGetter("basePriceIncludeTax")
	public Double getBasePriceIncludeTax() {
		return basePriceIncludeTax;
	}
	@JsonSetter("base_price_include_tax")
	public void setBasePriceIncludeTax(Double basePriceIncludeTax) {
		this.basePriceIncludeTax = basePriceIncludeTax;
	}

	@JsonGetter("rowTotalIncludeTax")
	public Integer getRowTotalIncludeTax() {
		return rowTotalIncludeTax;
	}
	@JsonSetter("row_total_incl_tax")
	public void setRowTotalIncludeTax(Integer rowTotalIncludeTax) {
		this.rowTotalIncludeTax = rowTotalIncludeTax;
	}
	@JsonGetter("baseRowTotalIncludeTax")
	public Integer getBaseRowTotalIncludeTax() {
		return baseRowTotalIncludeTax;
	}
	@JsonSetter("base_row_total_incl_tax")
	public void setBaseRowTotalIncludeTax(Integer baseRowTotalIncludeTax) {
		this.baseRowTotalIncludeTax = baseRowTotalIncludeTax;
	}
	@JsonGetter("weeeTaxAppliedAmount")
	public Double getWeeeTaxAppliedAmount() {
		return weeeTaxAppliedAmount;
	}
	@JsonSetter("weee_tax_applied_amount")
	public void setWeeeTaxAppliedAmount(Double weeeTaxAppliedAmount) {
		this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
	}
	@JsonGetter("weeeTaxApplied")
	public Double getWeeeTaxApplied() {
		return weeeTaxApplied;
	}
	@JsonSetter("weee_tax_applied")
	public void setWeeeTaxApplied(Double weeeTaxApplied) {
		this.weeeTaxApplied = weeeTaxApplied;
	}
	@JsonGetter("quantity")
	public Double getQuantity() {
		return quantity;
	}

	@JsonSetter("qty")
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
}
