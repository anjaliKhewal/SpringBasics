
package com.project1.controller;

import org.springframework.beans.factory.annotation.Value;

public class PlaceForAnnotation {
	@Value("USA")
	private String place;

	@Override
	public String toString() {
		return "PlaceForAnnotation [place=" + place + "]";
	}
	

}
