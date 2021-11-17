package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MagentoTotalSegment {
    @JsonProperty("code")
    private String code;

    @JsonProperty("title")
    private String title;

    @JsonProperty("value")
    private Double value;

    @JsonProperty("area")
    private String area;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public MagentoTotalSegment() {
    }
}
