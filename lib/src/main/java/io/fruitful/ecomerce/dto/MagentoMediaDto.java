package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class MagentoMediaDto {
	private Long id;

	private String mediaType;

	@JsonProperty("label")
	private String label;

	@JsonProperty("position")
	private Integer position;

	@JsonProperty("disabled")
	private boolean disabled;

	@JsonProperty("types")
	private List<String> types;

	private String fileUrl;

	@JsonGetter("mediaType")
	public String getMediaType() {
		return mediaType;
	}

	@JsonSetter("media_type")
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	@JsonGetter("fileUrl")
	public String getFileUrl() {
		return fileUrl;
	}

	@JsonSetter("file")
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public MagentoMediaDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}
}
