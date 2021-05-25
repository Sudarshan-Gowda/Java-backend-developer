package com.star.sud.restapi.userapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private Long addressId;

	@Column(name = "ADDRESS_TYPE")
	private String addressType;

	@Column(name = "ADDRESS_LINE01")
	private String addressLine01;

	@Column(name = "ADDRESS_LINE02")
	private String addressLine02;

	@Column(name = "POSTAL_CODE")
	private String postalCode;

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressType=" + addressType + ", addressLine01=" + addressLine01
				+ ", addressLine02=" + addressLine02 + ", postalCode=" + postalCode + "]";
	}

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
