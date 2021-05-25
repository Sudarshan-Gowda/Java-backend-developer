package com.star.sud.restapi.userapp.dto;

public class AddressDto {

	private Long addressId;

	private String addressType;

	private String addressLine01;

	private String addressLine02;

	private String postalCode;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine01() {
		return addressLine01;
	}

	public void setAddressLine01(String addressLine01) {
		this.addressLine01 = addressLine01;
	}

	public String getAddressLine02() {
		return addressLine02;
	}

	public void setAddressLine02(String addressLine02) {
		this.addressLine02 = addressLine02;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
