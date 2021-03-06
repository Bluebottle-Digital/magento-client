package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.*;
import io.fruitful.ecomerce.enums.MagentoProductStatus;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoProduct {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("name")
    private String name;

    private Long attributeSetId;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("status")
    private Long status;
    @JsonProperty("visibility")
    private Long visibility;

    private String typeId;

    private String createdAt;

    private String updatedAt;
    @JsonProperty("weight")
    private Long weight;

    private MagentoExtensionAttributes magentoExtensionAttributes;

    private List<MagentoCustomAttribute> customAttributes;

    private List<MagentoMediaDto> medias = new ArrayList<>();

    private Boolean soldOut = false;

    @JsonGetter("medias")
    public List<MagentoMediaDto> getMedias() {
        return medias;
    }

    @JsonSetter("media_gallery_entries")
    public void setMedias(List<MagentoMediaDto> medias) {
        for (MagentoMediaDto m : medias) {
            m.setFileUrl(m.getFileUrl());
        }
        this.medias = medias;
    }

    @JsonIgnore
    public boolean outOfStock() {
        if (MagentoProductStatus.Disabled.value() == status) {
            return true;
        }

        if (magentoExtensionAttributes != null && CollectionUtils.isEmpty(magentoExtensionAttributes.getWebsiteIds())) {
            return true;
        }

        if (magentoExtensionAttributes != null && magentoExtensionAttributes.getStockItem() != null) {
            MagentoStockItem stockItem = magentoExtensionAttributes.getStockItem();
            return Boolean.FALSE.equals(stockItem.getInStock()) || stockItem.getMinQty() >= stockItem.getQty();
        }

        return false;
    }

    @JsonGetter("attributeSetId")
    public Long getAttributeSetId() {
        return attributeSetId;
    }

    @JsonSetter("attribute_set_id")
    public void setAttributeSetId(Long attributeSetId) {
        this.attributeSetId = attributeSetId;
    }

    @JsonGetter("typeId")
    public String getTypeId() {
        return typeId;
    }

    @JsonSetter("type_id")
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @JsonGetter("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonGetter("updateAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonGetter("update_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonGetter("customAttributes")
    public List<MagentoCustomAttribute> getCustomAttributes() {
        return customAttributes;
    }

    @JsonSetter("custom_attributes")
    public void setCustomAttributes(List<MagentoCustomAttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }

    @JsonGetter("magentoExtensionAttributes")
    public MagentoExtensionAttributes getMagentoExtensionAttributes() {
        return magentoExtensionAttributes;
    }

    @JsonSetter("extension_attributes")
    public void setMagentoExtensionAttributes(MagentoExtensionAttributes magentoExtensionAttributes) {
        this.magentoExtensionAttributes = magentoExtensionAttributes;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public Boolean getSoldOut() {
        if (magentoExtensionAttributes == null) {
            return false;
        }

        if (magentoExtensionAttributes != null && magentoExtensionAttributes.getVendorInventory() != null) {
            MagentoVendorInventory inventory = magentoExtensionAttributes.getVendorInventory();
            return inventory.getQty() != null ? inventory.getQty() <= 0 : true;
        }

        return false;
    }

    public MagentoProduct() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getVisibility() {
        return visibility;
    }

    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
