package com.qaprosoft.onliner.utils;

public enum Years {
	
	Y_2017("2017"),
	Y_2016("2016"),
	Y_2015("2015");
	
	private String year;
	
	Years(String year) {
		this.year = year;
	}
	
	public String year() {
		return year;
	}
}
