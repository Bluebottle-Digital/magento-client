package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoCustomerRequest {
	private MagentoCustomer customer;
	private String password;
	private String redirectUrl;
}
