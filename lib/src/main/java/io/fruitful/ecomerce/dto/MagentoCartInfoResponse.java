package io.fruitful.ecomerce.dto;

public class MagentoCartInfoResponse {
    private MagentoCartResponse magentoCart;

    private MagentoCartTotalsResponse magentoCartTotals;

    public MagentoCartInfoResponse(MagentoCartResponse magentoCart, MagentoCartTotalsResponse magentoCartTotals) {
        this.magentoCart = magentoCart;
        this.magentoCartTotals = magentoCartTotals;
    }

    public MagentoCartResponse getMagentoCart() {
        return magentoCart;
    }

    public void setMagentoCart(MagentoCartResponse magentoCart) {
        this.magentoCart = magentoCart;
    }

    public MagentoCartTotalsResponse getMagentoCartTotals() {
        return magentoCartTotals;
    }

    public void setMagentoCartTotals(MagentoCartTotalsResponse magentoCartTotals) {
        this.magentoCartTotals = magentoCartTotals;
    }

    public MagentoCartInfoResponse() {
    }
}
