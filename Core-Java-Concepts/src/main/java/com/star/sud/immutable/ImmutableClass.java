package com.star.sud.immutable;

public final class ImmutableClass {

	private final String userName;

	public ImmutableClass(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

}
