package io.fruitful.ecomerce.enums;

/*
 * Created by Trong.Nguyen at 9/25/20, 4:13 PM.
 */

public enum MagentoProductStatus {
	Enable(1),
	Disabled(2);

	int value;

	MagentoProductStatus(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
}
