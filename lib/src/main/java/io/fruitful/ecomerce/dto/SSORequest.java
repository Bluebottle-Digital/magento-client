package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SSORequest {
    private String path;
    private CheckoutRequest checkout;
}
