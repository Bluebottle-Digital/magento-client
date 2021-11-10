package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
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
}
