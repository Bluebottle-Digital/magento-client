package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MagentoCustomer {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("group_id")
	private Long groupId;

	@JsonProperty("default_billing")
	private String defaultBilling;

	@JsonProperty("default_shipping")
	private String defaultShipping;

	@JsonProperty("confirmation")
	private String confirmation;

	@JsonProperty("dob")
	private String dob;

	@JsonProperty("email")
	private String email;

	@JsonProperty("firstname")
	private String firstName;

	@JsonProperty("lastname")
	private String lastName;

	@JsonProperty("middlename")
	private String middleName;

	@JsonProperty("prefix")
	private String prefix;

	@JsonProperty("suffix")
	private String suffix;

	@JsonProperty("gender")
	private Integer gender;

	@JsonProperty("store_id")
	private Integer storeId;

	@JsonProperty("taxvat")
	private String taxvat;

	@JsonProperty("website_id")
	private Integer websiteId;

	@JsonProperty("addresses")
	private List<MagentoAddress> addresses;

	@JsonProperty("disable_auto_group_change")
	private Integer disableAutoGroupChange;

	@JsonProperty("extension_attributes")
	private MagentoCustomerExtensionAttributes extensionAttributes;

	@JsonProperty("custom_attributes")
	private List<MagentoCustomAttribute> customAttributes;
}
