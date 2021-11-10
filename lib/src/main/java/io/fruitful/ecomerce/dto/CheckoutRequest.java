package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class CheckoutRequest {
    private String countryId;
    private String regionId;
    private String postalCode;
    private Set<ShippingRequest> shipping = new HashSet<>();
}
