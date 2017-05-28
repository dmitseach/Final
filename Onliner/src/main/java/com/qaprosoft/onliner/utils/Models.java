package com.qaprosoft.onliner.utils;

public enum Models {
	
	F_RS57K4000SA("RS57K4000SA"),
	F_RS57K4000WW("RS57K4000WW"),
	P_GALAXYA5("Galaxy A5"),
	P_S8("S8");
	
	private String model;
	
	Models(String model) {
		this.model = model;
	}
	
	public String model() {
		return model;
	}
}
