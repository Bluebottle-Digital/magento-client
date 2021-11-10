package io.fruitful.ecomerce.enums;

public enum MagentoProductAttributes {


    USER_ID("userid"),
    AVAILABLE("available");

    String name;

    MagentoProductAttributes(String name) {
        this.name = name;
    }
}
