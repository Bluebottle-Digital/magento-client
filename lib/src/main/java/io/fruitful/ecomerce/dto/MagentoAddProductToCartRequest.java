package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddProductToCartRequest {
	private MagentoCartItem cartItem;

	public MagentoAddProductToCartRequest(MagentoCartItem cartItem) {
		this.cartItem = cartItem;
	}

	public MagentoCartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(MagentoCartItem cartItem) {
		this.cartItem = cartItem;
	}
}
