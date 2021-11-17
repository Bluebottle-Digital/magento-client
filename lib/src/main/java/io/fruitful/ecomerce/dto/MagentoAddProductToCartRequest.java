package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddProductToCartRequest extends BaseCustomerTokenRequest{
	private MagentoCartItem cartItem;

	public MagentoAddProductToCartRequest(String bearerToken, Long customerId, MagentoCartItem cartItem) {
		super(bearerToken, customerId);
		this.cartItem = cartItem;
	}

	public MagentoCartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(MagentoCartItem cartItem) {
		this.cartItem = cartItem;
	}
}
