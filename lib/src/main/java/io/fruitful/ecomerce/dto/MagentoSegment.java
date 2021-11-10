package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MagentoSegment {
	@JsonProperty("code")
	private String code;
	@JsonProperty("title")
	private String title;
	@JsonProperty("value")
	private Object value;
	private MagentoExtensionAttributes extensionAttributes;

	@JsonGetter("extensionAttributes")
	public MagentoExtensionAttributes getExtensionAttributes() {
		return extensionAttributes;
	}

	@JsonSetter("extension_attributes")
	public void setExtensionAttributes(MagentoExtensionAttributes extensionAttributes) {
		this.extensionAttributes = extensionAttributes;
	}
}
