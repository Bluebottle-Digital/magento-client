package io.fruitful.ecomerce;

import org.springframework.util.StringUtils;

public class MagentoFactory {
    private final Configuration conf;

    public MagentoFactory(Configuration conf) {
        if (conf == null) {
            throw new NullPointerException("configuration cannot be null");
        }
       this.conf = conf;
    }

    public Magento getInstance() {
        String endpoint = conf.getEndpoint();
        String integrationToken = conf.getIntegrationToken();
        String mediaLocation = conf.getMediaLocation();
        if (StringUtils.isEmpty(endpoint) || StringUtils.isEmpty(integrationToken) || StringUtils.isEmpty(mediaLocation)) {
            throw new IllegalStateException("Endpoint or integrationToken or mediaLocation not supplied.");
        }

        return new MagentoImpl(conf);
    }

    public Magento getInstance(String customerToken) {
        String endpoint = conf.getEndpoint();
        String integrationToken = conf.getIntegrationToken();
        String mediaLocation = conf.getMediaLocation();
        if (StringUtils.isEmpty(endpoint)
                || StringUtils.isEmpty(integrationToken)
                || StringUtils.isEmpty(customerToken)
                || StringUtils.isEmpty(mediaLocation)) {
            throw new IllegalStateException("Endpoint or integrationToken or customerToken or mediaLocation not supplied.");
        }

        return new MagentoImpl(conf, customerToken);
    }
}
