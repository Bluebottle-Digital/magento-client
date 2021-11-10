package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Data
@NoArgsConstructor
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
}
