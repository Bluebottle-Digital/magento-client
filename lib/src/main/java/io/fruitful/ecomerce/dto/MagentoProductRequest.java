package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoProductRequest {
    private MagentoProduct product;

    public MagentoProductRequest(MagentoProduct product) {
        this.product = product;
    }

    public MagentoProductRequest() {
    }

    public MagentoProduct getProduct() {
        return product;
    }

    public void setProduct(MagentoProduct product) {
        this.product = product;
    }
}
