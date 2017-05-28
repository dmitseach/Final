package com.qaprosoft.onliner.utils;

public enum Resolutions {
	
	R_720x1280("720x1280"),
	R_1080x1920("1080x1920");
	
	private String resolution;
	
	Resolutions(String resolution) {
		this.resolution = resolution;
	}
	
	public String resolution() {
		return resolution;
	}
}
