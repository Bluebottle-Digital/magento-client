package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoExtensionAttributes {
    @JsonProperty("website_ids")
    public List<Long> websiteIds;
    @JsonProperty("stock_item")
    public MagentoStockItem stockItem;
    @JsonIgnore
    private Map<Object, Object> additionalProperties = new HashMap<>();

    @JsonProperty("vendor")
    private MagentoVendorResponse vendor;

    @JsonProperty("talent_user_id")
    private String talentUserId;
    
    @JsonProperty("in_wishlist")
    private Boolean inWishList;

    private Integer inStock;

    private MagentoVendorInventory vendorInventory;

    @JsonProperty("image")
    private String image;

    @JsonGetter("vendorInventory")
    public MagentoVendorInventory getVendorInventory() {
        return vendorInventory;
    }

    @JsonSetter("vendor_inventory")
    public void setVendorInventory(MagentoVendorInventory vendorInventory) {
        this.vendorInventory = vendorInventory;
    }

    @JsonGetter("inStock")
    public Integer getInStock() {
        return inStock;
    }

    @JsonSetter("in_stock")
    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }
    
    @JsonProperty("in_wishlist")
    public Boolean getInWishlist() {
        return inWishList;
    }

    /// Shipping Information
    private Double rewardPointsBalance;
    private Double rewardCurrencyAmount;
    private Double baseRewardCurrencyAmount;

    @JsonGetter("rewardPointsBalance")
    public Double getRewardPointsBalance() {
        return rewardPointsBalance;
    }

    @JsonSetter("reward_points_balance")
    public void setRewardPointsBalance(Double rewardPointsBalance) {
        this.rewardPointsBalance = rewardPointsBalance;
    }

    @JsonGetter("rewardCurrencyAmount")
    public Double getRewardCurrencyAmount() {
        return rewardCurrencyAmount;
    }

    @JsonSetter("reward_currency_amount")
    public void setRewardCurrencyAmount(Double rewardCurrencyAmount) {
        this.rewardCurrencyAmount = rewardCurrencyAmount;
    }

    @JsonGetter("baseRewardCurrencyAmount")
    public Double getBaseRewardCurrencyAmount() {
        return baseRewardCurrencyAmount;
    }

    @JsonSetter("base_reward_currency_amount")
    public void setBaseRewardCurrencyAmount(Double baseRewardCurrencyAmount) {
        this.baseRewardCurrencyAmount = baseRewardCurrencyAmount;
    }

    /// Total Segment Attributes
    private List<Long> gwItemIds;
    private Double gwPrice;
    private Double gwBasePrice;
    private Double gwItemsPrice;
    private Double gwItemsBasePrice;
    private Double gwCardPrice;
    private Double gwCardBasePrice;
    private List<Object> taxGrandTotalDetails;

    @JsonGetter("gwItemIds")
    public List<Long> getGwItemIds() {
        return gwItemIds;
    }
    @JsonSetter("gw_item_ids")
    public void setGwItemIds(List<Long> gwItemIds) {
        this.gwItemIds = gwItemIds;
    }
    @JsonGetter("gwPrice")
    public Double getGwPrice() {
        return gwPrice;
    }
    @JsonSetter("gw_price")
    public void setGwPrice(Double gwPrice) {
        this.gwPrice = gwPrice;
    }
    @JsonGetter("gwBasePrice")
    public Double getGwBasePrice() {
        return gwBasePrice;
    }
    @JsonSetter("gw_base_price")
    public void setGwBasePrice(Double gwBasePrice) {
        this.gwBasePrice = gwBasePrice;
    }
    @JsonGetter("gwItemsPrice")
    public Double getGwItemsPrice() {
        return gwItemsPrice;
    }
    @JsonSetter("gw_items_price")
    public void setGwItemsPrice(Double gwItemsPrice) {
        this.gwItemsPrice = gwItemsPrice;
    }
    @JsonGetter("gwItemsBasePrice")
    public Double getGwItemsBasePrice() {
        return gwItemsBasePrice;
    }
    @JsonSetter("gw_items_base_price")
    public void setGwItemsBasePrice(Double gwItemsBasePrice) {
        this.gwItemsBasePrice = gwItemsBasePrice;
    }
    @JsonGetter("gwCardPrice")
    public Double getGwCardPrice() {
        return gwCardPrice;
    }
    @JsonSetter("gw_card_price")
    public void setGwCardPrice(Double gwCardPrice) {
        this.gwCardPrice = gwCardPrice;
    }
    @JsonGetter("gwCardBasePrice")
    public Double getGwCardBasePrice() {
        return gwCardBasePrice;
    }
    @JsonSetter("gw_card_base_price")
    public void setGwCardBasePrice(Double gwCardBasePrice) {
        this.gwCardBasePrice = gwCardBasePrice;
    }
    @JsonGetter("taxGrandTotalDetails")
    public List<Object> getTaxGrandTotalDetails() {
        return taxGrandTotalDetails;
    }
    @JsonSetter("tax_grandtotal_details")
    public void setTaxGrandTotalDetails(List<Object> taxGrandTotalDetails) {
        this.taxGrandTotalDetails = taxGrandTotalDetails;
    }

    public MagentoExtensionAttributes() {
    }

    public List<Long> getWebsiteIds() {
        return websiteIds;
    }

    public void setWebsiteIds(List<Long> websiteIds) {
        this.websiteIds = websiteIds;
    }

    public MagentoStockItem getStockItem() {
        return stockItem;
    }

    public void setStockItem(MagentoStockItem stockItem) {
        this.stockItem = stockItem;
    }

    public Map<Object, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<Object, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public MagentoVendorResponse getVendor() {
        return vendor;
    }

    public void setVendor(MagentoVendorResponse vendor) {
        this.vendor = vendor;
    }

    public String getTalentUserId() {
        return talentUserId;
    }

    public void setTalentUserId(String talentUserId) {
        this.talentUserId = talentUserId;
    }

    public Boolean getInWishList() {
        return inWishList;
    }

    public void setInWishList(Boolean inWishList) {
        this.inWishList = inWishList;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
