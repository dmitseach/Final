package com.qaprosoft.onliner.utils;

public enum Colours {
	
	WHITE("белый"),
	BLACK("черный"),
	SILVER("серебристый");
	
	private String colour;
	
	Colours(String colour) {
		this.colour = colour;
	}
	
	public String colour() {
		return colour;
	}
}
