package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoCartInfoResponse {
    private MagentoCartResponse magentoCart;

    private MagentoCartTotalsResponse magentoCartTotals;

    public MagentoCartInfoResponse(MagentoCartResponse magentoCart, MagentoCartTotalsResponse magentoCartTotals) {
        this.magentoCart = magentoCart;
        this.magentoCartTotals = magentoCartTotals;
    }
}
