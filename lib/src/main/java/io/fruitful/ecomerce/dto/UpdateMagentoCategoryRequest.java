package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateMagentoCategoryRequest extends MagentoCategoryRequest{
    private Long magentoCategoryId;
}
