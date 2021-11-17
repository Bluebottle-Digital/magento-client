package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoProductOption {
	private MagentoCartExtensionAttributes extensionAttributes;

	public MagentoCartExtensionAttributes getExtensionAttributes() {
		return extensionAttributes;
	}

	public void setExtensionAttributes(MagentoCartExtensionAttributes extensionAttributes) {
		this.extensionAttributes = extensionAttributes;
	}

	public MagentoProductOption() {
	}
}
