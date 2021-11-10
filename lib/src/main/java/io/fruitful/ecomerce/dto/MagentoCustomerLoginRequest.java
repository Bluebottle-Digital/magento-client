package io.fruitful.ecomerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MagentoCustomerLoginRequest {
    private String username;

    private String password;

    public MagentoCustomerLoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

