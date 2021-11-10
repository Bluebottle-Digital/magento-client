package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoCategory {
	@JsonProperty("id")
	private Long id;

	private Long parentId;

	@JsonProperty("name")
	private String name;

	private boolean isActive;

	private Integer productCount;

	@JsonProperty("position")
	private Integer position;

	@JsonProperty("level")
	private Integer level;

	@JsonProperty("path")
	private String path;

	@JsonGetter("parentId")
	public Long getParentId() {
		return parentId;
	}

	@JsonSetter("parent_id")
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@JsonGetter("isActive")
	public boolean isActive() {
		return isActive;
	}

	@JsonSetter("is_active")
	public void setActive(boolean active) {
		isActive = active;
	}
}
