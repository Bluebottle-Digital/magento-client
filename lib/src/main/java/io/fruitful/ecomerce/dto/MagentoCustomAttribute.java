package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
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
}
