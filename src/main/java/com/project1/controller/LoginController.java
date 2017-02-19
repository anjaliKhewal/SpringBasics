package com.project1.controller;

import org.springframework.beans.factory.annotation.Value;



public class LoginController {

	private String place; 
	
	private Name fullName;
	
	public LoginController(String place, Name fullname){
		this.place = place;
		this.fullName = fullname;
		
	}
	
	
	public void setFullName(Name fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "LoginController [name=" + place + "]";
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void sayHello(){
		
		
		System.out.println("Hello "+ fullName+". He is from "+place);
	}
	
	
	
}
