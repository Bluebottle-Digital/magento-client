package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MagentoCartProductExtensionAttributes {
    @JsonProperty("image")
    private String image;

    @JsonProperty("vendor")
    private MagentoVendorResponse vendor;

    @JsonProperty("location")
    private MagentoLocationResponse location;
    
    @JsonProperty("in_wishlist")
    private Boolean inWishlist;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MagentoVendorResponse getVendor() {
        return vendor;
    }

    public void setVendor(MagentoVendorResponse vendor) {
        this.vendor = vendor;
    }

    public MagentoLocationResponse getLocation() {
        return location;
    }

    public void setLocation(MagentoLocationResponse location) {
        this.location = location;
    }

    public Boolean getInWishlist() {
        return inWishlist;
    }

    public void setInWishlist(Boolean inWishlist) {
        this.inWishlist = inWishlist;
    }

    public MagentoCartProductExtensionAttributes() {
    }
}
