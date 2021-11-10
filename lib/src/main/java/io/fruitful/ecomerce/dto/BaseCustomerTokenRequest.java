package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseCustomerTokenRequest {
    private String bearerToken;
    private Long customerId;

    public BaseCustomerTokenRequest(String bearerToken, Long customerId) {
        this.bearerToken = bearerToken;
        this.customerId = customerId;
    }
}
