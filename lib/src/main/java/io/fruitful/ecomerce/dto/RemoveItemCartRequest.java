package io.fruitful.ecomerce.dto;

public class RemoveItemCartRequest extends BaseCustomerTokenRequest {
    private Long itemId;

    public RemoveItemCartRequest(String customerToken, Long customerId, Long itemId) {
        super(customerToken, customerId);
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}
