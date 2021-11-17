package io.fruitful.ecomerce.dto;

import java.util.HashSet;
import java.util.Set;

public class CheckoutRequest {
    private String countryId;
    private String regionId;
    private String postalCode;
    private Set<ShippingRequest> shipping = new HashSet<>();

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Set<ShippingRequest> getShipping() {
        return shipping;
    }

    public void setShipping(Set<ShippingRequest> shipping) {
        this.shipping = shipping;
    }

    public CheckoutRequest() {
    }
}
