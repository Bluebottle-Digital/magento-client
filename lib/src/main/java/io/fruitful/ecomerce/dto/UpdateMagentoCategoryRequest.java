package io.fruitful.ecomerce.dto;


public class UpdateMagentoCategoryRequest extends MagentoCategoryRequest{
    private Long magentoCategoryId;

    @Override
    public Long getMagentoCategoryId() {
        return magentoCategoryId;
    }

    @Override
    public void setMagentoCategoryId(Long magentoCategoryId) {
        this.magentoCategoryId = magentoCategoryId;
    }

    public UpdateMagentoCategoryRequest() {
    }
}
