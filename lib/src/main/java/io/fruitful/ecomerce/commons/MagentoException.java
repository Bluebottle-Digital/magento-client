package io.fruitful.ecomerce.commons;

import java.io.Serializable;

public class MagentoException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;

	private MagentoErrorInfo error;

	public MagentoException(Throwable cause) {
		super(cause);
		this.setError(MagentoErrorInfo.INTERNAL_SERVER_ERROR);
	}

	public MagentoException(MagentoErrorInfo error) {
		this.setError(error);
	}

	public MagentoException(int errorCode, String error) {
		MagentoErrorInfo MagentoErrorInfo = new MagentoErrorInfo(errorCode, error);
		this.setError(MagentoErrorInfo);
	}

	public MagentoErrorInfo getError() {
		return error;
	}

	public void setError(MagentoErrorInfo error) {
		this.error = error;
	}

	@Override
	public String getMessage() {
		if(error != null) return error.getMessage();
		return super.getMessage();
	}
}
