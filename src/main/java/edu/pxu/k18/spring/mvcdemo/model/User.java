package edu.pxu.k18.spring.mvcdemo.model;

public class User {
	public User(String fullName) {
		super();
		this.fullName = fullName;
	}
	public User() {
		
	}

	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
