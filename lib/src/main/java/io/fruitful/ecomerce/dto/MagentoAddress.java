package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
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
}
