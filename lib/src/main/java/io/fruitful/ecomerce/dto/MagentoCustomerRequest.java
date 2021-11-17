package io.fruitful.ecomerce.dto;

public class MagentoCustomerRequest {
	private MagentoCustomer customer;
	private String password;
	private String redirectUrl;

	public MagentoCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(MagentoCustomer customer) {
		this.customer = customer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public MagentoCustomerRequest() {

	}
}
