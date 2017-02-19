package com.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class NameForAnnotation {
	@Value("Sumit")
	private String firstName;
	@Value("Kumar")
	private String lastName;
	@Autowired
	@Qualifier("placeForAnnotation")
	private PlaceForAnnotation placeAnnotation;
	
	//@Autowired
	public void setPlaceAnnotation(PlaceForAnnotation placeAnnotation) {
		this.placeAnnotation = placeAnnotation;
	}


	@Override
	public String toString() {
		return "NameForAnnotation [firstName=" + firstName + ", lastName="
				+ lastName + ", placeAnnotation=" + placeAnnotation + "]";
	}
	
	

}
