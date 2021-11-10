package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoTotalInfo {
	private Double grandTotal;
	private Double baseGrandTotal;
	@JsonProperty("subtotal")
	private Double subtotal;
	private Double baseSubtotal;
	private Double discountAmount;
	private Double baseDiscountAmount;
	private Double subtotalWithDiscount;
	private Double baseSubTotalWithDiscount;
	private Double shippingAmount;
	private Double baseShippingAmount;
	private Double taxAmount;
	private Double baseTaxAmount;
	private Double weeeTaxAppliedAmount;
	private Double shippingTaxAmount;
	private Double baseShippingTaxAmount;
	private Double subtotalInclTax;
	private Double shippingInclTax;
	private Double baseShippingInclTax;
	private String baseCurrencyCode;
	private String quoteCurrencyCode;
	private Long itemsQty;
	@JsonProperty("items")
	private List<MagentoTotalItem> items;
	private Double shippingDiscountAmount;
	private Double baseShippingDiscountAmount;
	private List<MagentoTotalSegment> totalSegments;
	private MagentoExtensionAttributes extensionAttributes;

	@JsonGetter("shippingDiscountAmount")
	public Double getShippingDiscountAmount() {
		return shippingDiscountAmount;
	}
	@JsonSetter("shipping_discount_amount")
	public void setShippingDiscountAmount(Double shippingDiscountAmount) {
		this.shippingDiscountAmount = shippingDiscountAmount;
	}
	@JsonGetter("baseShippingDiscountAmount")
	public Double getBaseShippingDiscountAmount() {
		return baseShippingDiscountAmount;
	}
	@JsonSetter("base_shipping_discount_amount")
	public void setBaseShippingDiscountAmount(Double baseShippingDiscountAmount) {
		this.baseShippingDiscountAmount = baseShippingDiscountAmount;
	}

	@JsonGetter("grandTotal")
	public Double getGrandTotal() {
		return grandTotal;
	}

	@JsonSetter("grand_total")
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	@JsonGetter("baseGrandTotal")
	public Double getBaseGrandTotal() {
		return baseGrandTotal;
	}

	@JsonSetter("base_grand_total")
	public void setBaseGrandTotal(Double baseGrandTotal) {
		this.baseGrandTotal = baseGrandTotal;
	}

	@JsonGetter("baseSubtotal")
	public Double getBaseSubtotal() {
		return baseSubtotal;
	}

	@JsonSetter("base_subtotal")
	public void setBaseSubtotal(Double baseSubtotal) {
		this.baseSubtotal = baseSubtotal;
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

	@JsonGetter("subtotalWithDiscount")
	public Double getSubtotalWithDiscount() {
		return subtotalWithDiscount;
	}

	@JsonSetter("subtotal_with_discount")
	public void setSubtotalWithDiscount(Double subtotalWithDiscount) {
		this.subtotalWithDiscount = subtotalWithDiscount;
	}

	@JsonGetter("baseSubTotalWithDiscount")
	public Double getBaseSubTotalWithDiscount() {
		return baseSubTotalWithDiscount;
	}

	@JsonSetter("base_subtotal_with_discount")
	public void setBaseSubTotalWithDiscount(Double baseSubTotalWithDiscount) {
		this.baseSubTotalWithDiscount = baseSubTotalWithDiscount;
	}

	@JsonGetter("shippingAmount")
	public Double getShippingAmount() {
		return shippingAmount;
	}

	@JsonSetter("shipping_amount")
	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	@JsonGetter("baseShippingAmount")
	public Double getBaseShippingAmount() {
		return baseShippingAmount;
	}

	@JsonSetter("base_shipping_amount")
	public void setBaseShippingAmount(Double baseShippingAmount) {
		this.baseShippingAmount = baseShippingAmount;
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

	@JsonGetter("weeeTaxAppliedAmount")
	public Double getWeeeTaxAppliedAmount() {
		return weeeTaxAppliedAmount;
	}

	@JsonSetter("weee_tax_applied_amount")
	public void setWeeeTaxAppliedAmount(Double weeeTaxAppliedAmount) {
		this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
	}

	@JsonGetter("shippingTaxAmount")
	public Double getShippingTaxAmount() {
		return shippingTaxAmount;
	}

	@JsonSetter("shipping_tax_amount")
	public void setShippingTaxAmount(Double shippingTaxAmount) {
		this.shippingTaxAmount = shippingTaxAmount;
	}

	@JsonGetter("baseShippingTaxAmount")
	public Double getBaseShippingTaxAmount() {
		return baseShippingTaxAmount;
	}

	@JsonSetter("base_shipping_tax_amount")
	public void setBaseShippingTaxAmount(Double baseShippingTaxAmount) {
		this.baseShippingTaxAmount = baseShippingTaxAmount;
	}

	@JsonGetter("subtotalInclTax")
	public Double getSubtotalInclTax() {
		return subtotalInclTax;
	}

	@JsonSetter("subtotal_incl_tax")
	public void setSubtotalInclTax(Double subtotalInclTax) {
		this.subtotalInclTax = subtotalInclTax;
	}

	@JsonGetter("shippingInclTax")
	public Double getShippingInclTax() {
		return shippingInclTax;
	}

	@JsonSetter("shipping_incl_tax")
	public void setShippingInclTax(Double shippingInclTax) {
		this.shippingInclTax = shippingInclTax;
	}

	@JsonGetter("baseShippingInclTax")
	public Double getBaseShippingInclTax() {
		return baseShippingInclTax;
	}

	@JsonSetter("base_shipping_incl_tax")
	public void setBaseShippingInclTax(Double baseShippingInclTax) {
		this.baseShippingInclTax = baseShippingInclTax;
	}

	@JsonGetter("baseCurrencyCode")
	public String getBaseCurrencyCode() {
		return baseCurrencyCode;
	}

	@JsonSetter("base_currency_code")
	public void setBaseCurrencyCode(String baseCurrencyCode) {
		this.baseCurrencyCode = baseCurrencyCode;
	}

	@JsonGetter("quoteCurrencyCode")
	public String getQuoteCurrencyCode() {
		return quoteCurrencyCode;
	}

	@JsonSetter("quote_currency_code")
	public void setQuoteCurrencyCode(String quoteCurrencyCode) {
		this.quoteCurrencyCode = quoteCurrencyCode;
	}

	@JsonGetter("itemsQty")
	public Long getItemsQty() {
		return itemsQty;
	}

	@JsonSetter("items_qty")
	public void setItemsQty(Long itemsQty) {
		this.itemsQty = itemsQty;
	}

	@JsonGetter("totalSegments")
	public List<MagentoTotalSegment> getTotalSegments() {
		return totalSegments;
	}

	@JsonSetter("total_segments")
	public void setTotalSegments(List<MagentoTotalSegment> totalSegments) {
		this.totalSegments = totalSegments;
	}
}
