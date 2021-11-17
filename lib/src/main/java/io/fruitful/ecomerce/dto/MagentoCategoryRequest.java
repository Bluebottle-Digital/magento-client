package io.fruitful.ecomerce.dto;

public class MagentoCategoryRequest {
    private Long magentoCategoryId;

    private String name;

    private Long magentoParentCategoryId;

    public Long getMagentoCategoryId() {
        return magentoCategoryId;
    }

    public void setMagentoCategoryId(Long magentoCategoryId) {
        this.magentoCategoryId = magentoCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMagentoParentCategoryId() {
        return magentoParentCategoryId;
    }

    public void setMagentoParentCategoryId(Long magentoParentCategoryId) {
        this.magentoParentCategoryId = magentoParentCategoryId;
    }

    public MagentoCategoryRequest() {
    }
}
