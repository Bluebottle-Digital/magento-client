package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoCountryDetail extends MagentoCountry {

	List<MagentoRegion> availableRegions = new ArrayList<>();

	@JsonGetter("availableRegions")
	public List<MagentoRegion> getAvaiableRegions() {
		return availableRegions;
	}

	@JsonSetter("available_regions")
	public void setAvaiableRegions(List<MagentoRegion> avaiableRegions) {
		this.availableRegions = avaiableRegions;
	}

	public List<MagentoRegion> getAvailableRegions() {
		return availableRegions;
	}

	public void setAvailableRegions(List<MagentoRegion> availableRegions) {
		this.availableRegions = availableRegions;
	}

	public MagentoCountryDetail() {
	}
}