package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddressRequest {
	private String region;

	private Long regionId;

	private String regionCode;

	private String countryId;

	private List<String> street = new ArrayList<>();

	private String postcode;

	private String city;

	private String firstname;

	private String lastname;

	private Long customerId;

	private String email;

	private String telephone;

	private Integer sameAsBilling;

	private Integer save_in_address_book;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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

	public Integer getSameAsBilling() {
		return sameAsBilling;
	}

	public void setSameAsBilling(Integer sameAsBilling) {
		this.sameAsBilling = sameAsBilling;
	}

	public Integer getSave_in_address_book() {
		return save_in_address_book;
	}

	public void setSave_in_address_book(Integer save_in_address_book) {
		this.save_in_address_book = save_in_address_book;
	}

	public MagentoAddressRequest() {
	}
}
