package io.fruitful.ecomerce.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
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
}