package com.qaprosoft.onliner.utils;

public enum OperatingSystems {
	
	ANDROID("Android"),
	IOS("Apple iOS"),
	WINDOWS("Windows Phone");
	
	private String os;
	
	OperatingSystems(String os) {
		this.os = os;
	}
	
	public String os() {
		return os;
	}
}
