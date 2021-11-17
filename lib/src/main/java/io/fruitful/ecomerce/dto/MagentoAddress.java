package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddress {
	@JsonProperty("id")
	private Long id;
	@JsonProperty("customer_id")
	private String customerId;
	@JsonProperty("region")
	private MagentoAddressRegion region;
	@JsonProperty("telephone")
	private String telephone;
	@JsonProperty("postcode")
	private String postCost;
	@JsonProperty("city")
	private String city;
	@JsonProperty("country_id")
	private String countryId;
	@JsonProperty("region_id")
	private Long regionId;
	@JsonProperty("street")
	private List<String> street;
	@JsonProperty("firstname")
	private String firstName;
	@JsonProperty("lastname")
	private String lastName;
	@JsonProperty("default_shipping")
	private boolean defaultShipping;
	@JsonProperty("default_billing")
	private boolean defaultBilling;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public MagentoAddressRegion getRegion() {
		return region;
	}

	public void setRegion(MagentoAddressRegion region) {
		this.region = region;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPostCost() {
		return postCost;
	}

	public void setPostCost(String postCost) {
		this.postCost = postCost;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public List<String> getStreet() {
		return street;
	}

	public void setStreet(List<String> street) {
		this.street = street;
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

	public boolean isDefaultShipping() {
		return defaultShipping;
	}

	public void setDefaultShipping(boolean defaultShipping) {
		this.defaultShipping = defaultShipping;
	}

	public boolean isDefaultBilling() {
		return defaultBilling;
	}

	public void setDefaultBilling(boolean defaultBilling) {
		this.defaultBilling = defaultBilling;
	}

	public MagentoAddress() {
	}
}
