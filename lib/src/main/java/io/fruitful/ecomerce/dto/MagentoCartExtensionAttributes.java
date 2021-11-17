package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoCartExtensionAttributes {
	private List<MagentoCustomOption> customOptions = null;

	public List<MagentoCustomOption> getCustomOptions() {
		return customOptions;
	}

	public void setCustomOptions(List<MagentoCustomOption> customOptions) {
		this.customOptions = customOptions;
	}

	public MagentoCartExtensionAttributes() {
	}
}