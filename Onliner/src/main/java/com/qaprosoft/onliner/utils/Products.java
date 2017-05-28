package com.qaprosoft.onliner.utils;

public enum Products {
	
	FRIDGES("Холодильники"),
	MOBILE_PHONES("Мобильные телефоны");
	
	private String product;
	
	Products(String product) {
		this.product = product;
	}
	
	public String product() {
		return product;
	}
}
