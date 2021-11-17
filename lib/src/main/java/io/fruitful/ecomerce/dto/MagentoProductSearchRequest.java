package io.fruitful.ecomerce.dto;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class MagentoProductSearchRequest {
    int DEFAULT_PAGE_SIZE = 70;

    private Set<String> userIds = new HashSet<>(); // Talents
    private Set<Long> categoryIds = new HashSet<>(); // Product categories
    private String keyword; //Search for product name
    private Integer status;  //1: Enable | 2: Disable
    private Integer stockStatus; //1: in stock | 2: out of stock
    private Integer approvalStatus; // 1 Approve | 2 Awaiting approve

    private String orderBy;

    private String orderDirection;

    private Integer pageIndex;

    private Integer pageSize;

    public Integer getPageIndex() {
        //Magento api return page index start at 1.
        if (pageIndex == null) {
            return 1;
        }

        return this.pageIndex + 1;
    }

    public Integer getPageSize() {
        return Optional.ofNullable(this.pageSize).orElse(DEFAULT_PAGE_SIZE);
    }

    public Set<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(Set<String> userIds) {
        this.userIds = userIds;
    }

    public Set<Long> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(Set<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public MagentoProductSearchRequest() {
    }
}
