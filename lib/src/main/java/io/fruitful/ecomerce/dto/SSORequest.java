package io.fruitful.ecomerce.dto;

public class SSORequest {
    private String path;
    private CheckoutRequest checkout;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CheckoutRequest getCheckout() {
        return checkout;
    }

    public void setCheckout(CheckoutRequest checkout) {
        this.checkout = checkout;
    }

    public SSORequest() {
    }
}
