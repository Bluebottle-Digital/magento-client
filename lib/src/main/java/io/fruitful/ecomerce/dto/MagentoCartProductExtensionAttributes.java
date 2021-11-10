package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoCartProductExtensionAttributes {
    @JsonProperty("image")
    private String image;

    @JsonProperty("vendor")
    private MagentoVendorResponse vendor;

    @JsonProperty("location")
    private MagentoLocationResponse location;
    
    @JsonProperty("in_wishlist")
    private Boolean inWishlist;
}
