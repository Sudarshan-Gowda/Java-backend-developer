package com.star.sud.constructor;

public class User {

	// Properties
	private int id;
	private String name;

	// Default Constructors
	public User() {

	}

	// User-Defined Constructors
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Properties
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
