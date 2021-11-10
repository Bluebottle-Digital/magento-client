package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
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
}