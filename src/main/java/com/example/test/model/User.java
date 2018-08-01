package com.example.test.model;

import java.util.List;



public class User {
	
	
	private String username;	
	
	private String password;
	private List<String> coursesName;
	private Address address;
	public User() {
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getCoursesName() {
		return coursesName;
	}
	public void setCoursesName(List<String> coursesName) {
		this.coursesName = coursesName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}