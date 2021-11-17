package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoWishlistRequest extends BaseCustomerTokenRequest {
    private String sku;

    public MagentoWishlistRequest(String bearerToken, Long customerId) {
        super(bearerToken, customerId);
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
