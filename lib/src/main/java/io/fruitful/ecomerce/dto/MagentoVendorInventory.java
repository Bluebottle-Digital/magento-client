package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoVendorInventory {
    private Integer locationId;

    @JsonProperty("qty")
    private Integer qty;

    private Integer inventoryId;

    @JsonGetter("locationId")
    public Integer getLocationId() {
        return locationId;
    }

    @JsonSetter("location_id")
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @JsonGetter("inventoryId")
    public Integer getInventoryId() {
        return inventoryId;
    }

    @JsonSetter("inventory_id")
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }
}
