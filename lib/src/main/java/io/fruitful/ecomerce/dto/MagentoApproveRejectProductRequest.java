package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoApproveRejectProductRequest {
    private String sku;
    private String talentUserId;
}
