package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoAddressRegion {
	@JsonProperty("region_code")
	private String regionCode;
	@JsonProperty("region")
	private String region;
	@JsonProperty("region_id")
	private Long regionId;
}
