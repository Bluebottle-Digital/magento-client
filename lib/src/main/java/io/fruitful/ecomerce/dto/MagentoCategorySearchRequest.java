package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoCategorySearchRequest {
	private String keyword;
	private Long parentId;
	private Boolean includeSubChildren;
	private Integer isActive;
}
