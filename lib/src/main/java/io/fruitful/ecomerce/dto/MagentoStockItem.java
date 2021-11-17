package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoStockItem {

	@JsonProperty("item_id")
	public Long itemId;

	@JsonProperty("product_id")
	public Long productId;

	@JsonProperty("stock_id")
	public Long stockId;

	@JsonProperty("qty")
	public Long qty;

	@JsonProperty("is_in_stock")
	public Boolean isInStock;

	@JsonProperty("is_qty_decimal")
	public Boolean isQtyDecimal;

	@JsonProperty("show_default_notification_message")
	public Boolean showDefaultNotificationMessage;

	@JsonProperty("use_config_min_qty")
	public Boolean useConfigMinQty;

	@JsonProperty("min_qty")
	public Long minQty;

	@JsonProperty("use_config_min_sale_qty")
	public Long useConfigMinSaleQty;

	@JsonProperty("min_sale_qty")
	public Long minSaleQty;

	@JsonProperty("use_config_max_sale_qty")
	public Boolean useConfigMaxSaleQty;

	@JsonProperty("max_sale_qty")
	public Long maxSaleQty;

	@JsonProperty("use_config_backorders")
	public Boolean useConfigBackorders;

	@JsonProperty("backorders")
	public Long backorders;

	@JsonProperty("use_config_notify_stock_qty")
	public Boolean useConfigNotifyStockQty;

	@JsonProperty("notify_stock_qty")
	public Long notifyStockQty;

	@JsonProperty("use_config_qty_increments")
	public Boolean useConfigQtyIncrements;

	@JsonProperty("qty_increments")
	public Long qtyIncrements;

	@JsonProperty("use_config_enable_qty_inc")
	public Boolean useConfigEnableQtyInc;

	@JsonProperty("enable_qty_increments")
	public Boolean enableQtyIncrements;

	@JsonProperty("use_config_manage_stock")
	public Boolean useConfigManageStock;

	@JsonProperty("manage_stock")
	public Boolean manageStock;

	@JsonProperty("low_stock_date")
	public String lowStockDate;

	@JsonProperty("is_decimal_divided")
	public Boolean isDecimalDivided;

	@JsonProperty("stock_status_changed_auto")
	public Long stockStatusChangedAuto;

	public MagentoStockItem() {
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

	public Boolean getInStock() {
		return isInStock;
	}

	public void setInStock(Boolean inStock) {
		isInStock = inStock;
	}

	public Boolean getQtyDecimal() {
		return isQtyDecimal;
	}

	public void setQtyDecimal(Boolean qtyDecimal) {
		isQtyDecimal = qtyDecimal;
	}

	public Boolean getShowDefaultNotificationMessage() {
		return showDefaultNotificationMessage;
	}

	public void setShowDefaultNotificationMessage(Boolean showDefaultNotificationMessage) {
		this.showDefaultNotificationMessage = showDefaultNotificationMessage;
	}

	public Boolean getUseConfigMinQty() {
		return useConfigMinQty;
	}

	public void setUseConfigMinQty(Boolean useConfigMinQty) {
		this.useConfigMinQty = useConfigMinQty;
	}

	public Long getMinQty() {
		return minQty;
	}

	public void setMinQty(Long minQty) {
		this.minQty = minQty;
	}

	public Long getUseConfigMinSaleQty() {
		return useConfigMinSaleQty;
	}

	public void setUseConfigMinSaleQty(Long useConfigMinSaleQty) {
		this.useConfigMinSaleQty = useConfigMinSaleQty;
	}

	public Long getMinSaleQty() {
		return minSaleQty;
	}

	public void setMinSaleQty(Long minSaleQty) {
		this.minSaleQty = minSaleQty;
	}

	public Boolean getUseConfigMaxSaleQty() {
		return useConfigMaxSaleQty;
	}

	public void setUseConfigMaxSaleQty(Boolean useConfigMaxSaleQty) {
		this.useConfigMaxSaleQty = useConfigMaxSaleQty;
	}

	public Long getMaxSaleQty() {
		return maxSaleQty;
	}

	public void setMaxSaleQty(Long maxSaleQty) {
		this.maxSaleQty = maxSaleQty;
	}

	public Boolean getUseConfigBackorders() {
		return useConfigBackorders;
	}

	public void setUseConfigBackorders(Boolean useConfigBackorders) {
		this.useConfigBackorders = useConfigBackorders;
	}

	public Long getBackorders() {
		return backorders;
	}

	public void setBackorders(Long backorders) {
		this.backorders = backorders;
	}

	public Boolean getUseConfigNotifyStockQty() {
		return useConfigNotifyStockQty;
	}

	public void setUseConfigNotifyStockQty(Boolean useConfigNotifyStockQty) {
		this.useConfigNotifyStockQty = useConfigNotifyStockQty;
	}

	public Long getNotifyStockQty() {
		return notifyStockQty;
	}

	public void setNotifyStockQty(Long notifyStockQty) {
		this.notifyStockQty = notifyStockQty;
	}

	public Boolean getUseConfigQtyIncrements() {
		return useConfigQtyIncrements;
	}

	public void setUseConfigQtyIncrements(Boolean useConfigQtyIncrements) {
		this.useConfigQtyIncrements = useConfigQtyIncrements;
	}

	public Long getQtyIncrements() {
		return qtyIncrements;
	}

	public void setQtyIncrements(Long qtyIncrements) {
		this.qtyIncrements = qtyIncrements;
	}

	public Boolean getUseConfigEnableQtyInc() {
		return useConfigEnableQtyInc;
	}

	public void setUseConfigEnableQtyInc(Boolean useConfigEnableQtyInc) {
		this.useConfigEnableQtyInc = useConfigEnableQtyInc;
	}

	public Boolean getEnableQtyIncrements() {
		return enableQtyIncrements;
	}

	public void setEnableQtyIncrements(Boolean enableQtyIncrements) {
		this.enableQtyIncrements = enableQtyIncrements;
	}

	public Boolean getUseConfigManageStock() {
		return useConfigManageStock;
	}

	public void setUseConfigManageStock(Boolean useConfigManageStock) {
		this.useConfigManageStock = useConfigManageStock;
	}

	public Boolean getManageStock() {
		return manageStock;
	}

	public void setManageStock(Boolean manageStock) {
		this.manageStock = manageStock;
	}

	public String getLowStockDate() {
		return lowStockDate;
	}

	public void setLowStockDate(String lowStockDate) {
		this.lowStockDate = lowStockDate;
	}

	public Boolean getDecimalDivided() {
		return isDecimalDivided;
	}

	public void setDecimalDivided(Boolean decimalDivided) {
		isDecimalDivided = decimalDivided;
	}

	public Long getStockStatusChangedAuto() {
		return stockStatusChangedAuto;
	}

	public void setStockStatusChangedAuto(Long stockStatusChangedAuto) {
		this.stockStatusChangedAuto = stockStatusChangedAuto;
	}
}