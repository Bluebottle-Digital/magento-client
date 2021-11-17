package io.fruitful.ecomerce.dto;

public class BaseCustomerTokenRequest {
    private String bearerToken;
    private Long customerId;

    public BaseCustomerTokenRequest(String bearerToken, Long customerId) {
        this.bearerToken = bearerToken;
        this.customerId = customerId;
    }

    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
