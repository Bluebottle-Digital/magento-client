package io.fruitful.ecomerce.dto;

public class RemoveItemCartRequest {
    private Long itemId;

    public RemoveItemCartRequest(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}
