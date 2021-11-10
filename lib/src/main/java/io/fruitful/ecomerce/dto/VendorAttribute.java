package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorAttribute {
	private Integer locationId;

	private Long vendorId;

	@JsonGetter("locationId")
	public Integer getLocationId() {
		return locationId;
	}

	@JsonSetter("location_id")
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@JsonGetter("vendorId")
	public Long getVendorId() {
		return vendorId;
	}

	@JsonSetter("vendor_id")
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
}
