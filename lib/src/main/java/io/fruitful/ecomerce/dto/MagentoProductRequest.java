package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoProductRequest extends BaseCustomerTokenRequest {
    private MagentoProduct product;

    public MagentoProductRequest(String bearerToken, Long customerId, MagentoProduct product) {
        super(bearerToken, customerId);
        this.product = product;
    }

    public MagentoProduct getProduct() {
        return product;
    }

    public void setProduct(MagentoProduct product) {
        this.product = product;
    }
}
