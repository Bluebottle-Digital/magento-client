package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class MagentoAddProductToCartRequest extends BaseCustomerTokenRequest{
	private MagentoCartItem cartItem;
}
