package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class MagentoProductDetailRequest extends BaseCustomerTokenRequest {
	private String sku;
}
