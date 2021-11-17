package io.fruitful.ecomerce.dto;

public class MagentoApproveRejectProductRequest {
    private String sku;
    private String talentUserId;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTalentUserId() {
        return talentUserId;
    }

    public void setTalentUserId(String talentUserId) {
        this.talentUserId = talentUserId;
    }

    public MagentoApproveRejectProductRequest() {
    }
}
