package io.fruitful.ecomerce;

import io.fruitful.ecomerce.magento.MagentoAdmin;
import io.fruitful.ecomerce.magento.MagentoAdminImpl;
import io.fruitful.ecomerce.magento.MagentoCustomer;
import io.fruitful.ecomerce.magento.MagentoCustomerImpl;
import org.apache.commons.lang3.StringUtils;

public class MagentoFactory {
    private final Configuration conf;

    public MagentoFactory(Configuration conf) {
        if (conf == null) {
            throw new NullPointerException("configuration cannot be null");
        }
        String endpoint = conf.getEndpoint();
        String integrationToken = conf.getIntegrationToken();
        String mediaLocation = conf.getMediaLocation();
        if (StringUtils.isEmpty(endpoint) || StringUtils.isEmpty(integrationToken) || StringUtils.isEmpty(mediaLocation)) {
            throw new IllegalStateException("Endpoint or integrationToken or mediaLocation not supplied.");
        }
        this.conf = conf;
    }

    public MagentoAdmin getInstance() {
        return new MagentoAdminImpl(conf);
    }

    public MagentoCustomer getInstance(String customerToken) {
        return new MagentoCustomerImpl(conf, customerToken);
    }

    public Configuration getConf() {
        return conf;
    }
}
