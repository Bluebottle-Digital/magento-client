package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
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
}
