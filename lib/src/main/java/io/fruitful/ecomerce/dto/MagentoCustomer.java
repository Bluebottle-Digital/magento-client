package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getDefaultBilling() {
		return defaultBilling;
	}

	public void setDefaultBilling(String defaultBilling) {
		this.defaultBilling = defaultBilling;
	}

	public String getDefaultShipping() {
		return defaultShipping;
	}

	public void setDefaultShipping(String defaultShipping) {
		this.defaultShipping = defaultShipping;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getTaxvat() {
		return taxvat;
	}

	public void setTaxvat(String taxvat) {
		this.taxvat = taxvat;
	}

	public Integer getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(Integer websiteId) {
		this.websiteId = websiteId;
	}

	public List<MagentoAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<MagentoAddress> addresses) {
		this.addresses = addresses;
	}

	public Integer getDisableAutoGroupChange() {
		return disableAutoGroupChange;
	}

	public void setDisableAutoGroupChange(Integer disableAutoGroupChange) {
		this.disableAutoGroupChange = disableAutoGroupChange;
	}

	public MagentoCustomerExtensionAttributes getExtensionAttributes() {
		return extensionAttributes;
	}

	public void setExtensionAttributes(MagentoCustomerExtensionAttributes extensionAttributes) {
		this.extensionAttributes = extensionAttributes;
	}

	public List<MagentoCustomAttribute> getCustomAttributes() {
		return customAttributes;
	}

	public void setCustomAttributes(List<MagentoCustomAttribute> customAttributes) {
		this.customAttributes = customAttributes;
	}

	public MagentoCustomer() {
	}
}
