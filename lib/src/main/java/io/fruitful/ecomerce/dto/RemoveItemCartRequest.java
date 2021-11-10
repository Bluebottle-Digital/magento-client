package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RemoveItemCartRequest extends BaseCustomerTokenRequest {
    private Long itemId;

    public RemoveItemCartRequest(String customerToken, Long customerId, Long itemId) {
        super(customerToken, customerId);
        this.itemId = itemId;
    }
}
