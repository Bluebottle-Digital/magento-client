package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoShippingInfo {
	private List<MagentoPaymentMethod> paymentMethods;
	@JsonProperty("totals")
	private MagentoTotalInfo totals;

	@JsonGetter("paymentMethods")
	public List<MagentoPaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}

	@JsonSetter("payment_methods")
	public void setPaymentMethods(List<MagentoPaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public MagentoTotalInfo getTotals() {
		return totals;
	}

	public void setTotals(MagentoTotalInfo totals) {
		this.totals = totals;
	}

	public MagentoShippingInfo() {
	}
}
