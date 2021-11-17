package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddressDto {
	@JsonProperty("region")
	private String region;

	private Long regionId;

	private String regionCode;

	private String countryId;

	@JsonProperty("street")
	private List<String> street = new ArrayList<>();

	@JsonProperty("postcode")
	private String postcode;

	@JsonProperty("city")
	private String city;

	private String firstname;

	private String lastname;

	private Long customerId;

	@JsonProperty("email")
	private String email;

	@JsonProperty("telephone")
	private String telephone;

	private Integer sameAsBilling;

	@JsonGetter("region_id")
	public Long getRegionId() {
		return regionId;
	}

	@JsonSetter("regionId")
	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	@JsonGetter("region_code")
	public String getRegionCode() {
		return regionCode;
	}

	@JsonSetter("regionCode")
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	@JsonGetter("country_id")
	public String getCountryId() {
		return countryId;
	}

	@JsonSetter("countryId")
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	@JsonGetter("firstname")
	public String getFirstname() {
		return firstname;
	}

	@JsonSetter("firstname")
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@JsonGetter("lastname")
	public String getLastname() {
		return lastname;
	}

	@JsonSetter("lastname")
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@JsonGetter("customer_id")
	public Long getCustomerId() {
		return customerId;
	}

	@JsonSetter("customerId")
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@JsonGetter("same_as_billing")
	public Integer getSameAsBilling() {
		return sameAsBilling;
	}

	@JsonSetter("sameAsBilling")
	public void setSameAsBilling(Integer sameAsBilling) {
		this.sameAsBilling = sameAsBilling;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<String> getStreet() {
		return street;
	}

	public void setStreet(List<String> street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public MagentoAddressDto() {
	}
}
