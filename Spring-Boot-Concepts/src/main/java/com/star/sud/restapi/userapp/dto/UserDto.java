package com.star.sud.restapi.userapp.dto;

import java.util.Set;

public class UserDto {

	private Long userId;

	private String userName;

	private String email;

	private Character gender;

	private Set<AddressDto> address;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Set<AddressDto> getAddress() {
		return address;
	}

	public void setAddress(Set<AddressDto> address) {
		this.address = address;
	}

}
