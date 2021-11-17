package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public MagentoSegment() {
	}
}

