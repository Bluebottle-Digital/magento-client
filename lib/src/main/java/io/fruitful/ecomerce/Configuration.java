package io.fruitful.ecomerce;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Configuration {
    private String endpoint;
    private String integrationToken;
    private List<String> defaultCategories;
    private Long defaultCategoryId;
    private Long talentsCategoryId;
    private String mediaLocation;
}
