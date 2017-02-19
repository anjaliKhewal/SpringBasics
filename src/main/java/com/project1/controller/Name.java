package com.project1.controller;

public class Name {
	private String firstName;
	
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private String lastName;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
