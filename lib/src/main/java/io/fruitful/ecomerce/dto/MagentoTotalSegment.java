package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MagentoTotalSegment {
    @JsonProperty("code")
    private String code;

    @JsonProperty("title")
    private String title;

    @JsonProperty("value")
    private Double value;

    @JsonProperty("area")
    private String area;
}
