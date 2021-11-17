package io.fruitful.ecomerce.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public MagentoCategory() {
	}
}
