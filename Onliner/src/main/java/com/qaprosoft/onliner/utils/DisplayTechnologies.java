package com.qaprosoft.onliner.utils;

public enum DisplayTechnologies {
	
	TFT("TFT"),
	IPS("IPS"),
	AMOLED("AMOLED");
	
	private String display;
	
	DisplayTechnologies(String display) {
		this.display = display;
	}
	
	public String display() {
		return display;
	}
}
