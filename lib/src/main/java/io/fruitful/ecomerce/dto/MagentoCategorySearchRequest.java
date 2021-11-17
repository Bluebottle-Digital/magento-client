package io.fruitful.ecomerce.dto;

public class MagentoCategorySearchRequest {
	private String keyword;
	private Long parentId;
	private Boolean includeSubChildren;
	private Integer isActive;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Boolean getIncludeSubChildren() {
		return includeSubChildren;
	}

	public void setIncludeSubChildren(Boolean includeSubChildren) {
		this.includeSubChildren = includeSubChildren;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public MagentoCategorySearchRequest() {
	}
}
