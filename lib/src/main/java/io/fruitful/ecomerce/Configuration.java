package io.fruitful.ecomerce;

import java.util.List;

public class Configuration {
    private String endpoint;
    private String integrationToken;
    private List<String> defaultCategories;
    private Long defaultCategoryId;
    private Long talentsCategoryId;
    private String mediaLocation;

    public Configuration() {
    }

    public Configuration(String endpoint, String integrationToken, List<String> defaultCategories, Long defaultCategoryId, Long talentsCategoryId, String mediaLocation) {
        this.endpoint = endpoint;
        this.integrationToken = integrationToken;
        this.defaultCategories = defaultCategories;
        this.defaultCategoryId = defaultCategoryId;
        this.talentsCategoryId = talentsCategoryId;
        this.mediaLocation = mediaLocation;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getIntegrationToken() {
        return integrationToken;
    }

    public void setIntegrationToken(String integrationToken) {
        this.integrationToken = integrationToken;
    }

    public List<String> getDefaultCategories() {
        return defaultCategories;
    }

    public void setDefaultCategories(List<String> defaultCategories) {
        this.defaultCategories = defaultCategories;
    }

    public Long getDefaultCategoryId() {
        return defaultCategoryId;
    }

    public void setDefaultCategoryId(Long defaultCategoryId) {
        this.defaultCategoryId = defaultCategoryId;
    }

    public Long getTalentsCategoryId() {
        return talentsCategoryId;
    }

    public void setTalentsCategoryId(Long talentsCategoryId) {
        this.talentsCategoryId = talentsCategoryId;
    }

    public String getMediaLocation() {
        return mediaLocation;
    }

    public void setMediaLocation(String mediaLocation) {
        this.mediaLocation = mediaLocation;
    }
}
