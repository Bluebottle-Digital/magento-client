package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MagentoCustomAttribute {

    private String attributeCode;

    @JsonProperty("value")
    private Object value;

    @JsonGetter("attributeCode")
    public String getAttributeCode() {
        return attributeCode;
    }

    @JsonSetter("attribute_code")
    public void setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MagentoCustomAttribute() {
    }
}
