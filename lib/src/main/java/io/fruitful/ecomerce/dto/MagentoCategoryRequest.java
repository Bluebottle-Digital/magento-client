package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoCategoryRequest {
    private Long magentoCategoryId;

    private String name;

    private Long magentoParentCategoryId;
}
