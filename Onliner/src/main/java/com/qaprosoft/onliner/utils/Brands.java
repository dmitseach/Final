package com.qaprosoft.onliner.utils;

public enum Brands {
	
	SAMSUNG("Samsung"),
	DAEWOO("Daewoo"),
	LG("LG");
	
	private String brand;
	
	Brands(String brand) {
		this.brand = brand;
	}
	
	public String brand() {
		return brand;
	}
}
