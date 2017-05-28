package com.qaprosoft.onliner.objects;

public class Phone {
	private long id;
	private String model;
	private String resolution;
	private String brand;
	private String os;
	private String display;
	private String year;
	
	public Phone(long id, String model, String brand, String resolution, String os, String display, String year) {
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.resolution = resolution;
		this.os = os;
		this.display = display;
		this.year = year;
	}

	public Phone() {
	}

	public long getPhoneId() {
		return id;
	}

	public String getPhoneModel() {
		return model;
	}

	public String getPhoneBrand() {
		return brand;
	}

	public String getPhoneResolution() {
		return resolution;
	}

	public String getPhoneOS() {
		return os;
	}

	public String getPhoneDisplay() {
		return display;
	}
	
	public String getPhoneYear() {
		return year;
	}

}
