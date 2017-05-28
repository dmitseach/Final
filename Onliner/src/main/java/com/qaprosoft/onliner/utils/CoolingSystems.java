package com.qaprosoft.onliner.utils;

public enum CoolingSystems {
	
	WITHOUT_NO_FROST("без No Frost"),
	NO_FROST_COOLING_CAMERA("No Frost(холодильная камера)"),
	NO_FROST_FREEZER("No Frost(морозильная камера)"),
	FULL_NO_FROST("полный No Frost");
	
	private String coolSyst;
	
	CoolingSystems(String coolSyst) {
		this.coolSyst = coolSyst;
	}

	public String coolSyst() {
		return coolSyst;
	}
}
