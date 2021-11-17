package io.fruitful.ecomerce.dto;

public class MagentoProductDetailRequest extends BaseCustomerTokenRequest {
	private String sku;

	public MagentoProductDetailRequest(String bearerToken, Long customerId) {
		super(bearerToken, customerId);
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
}
