package com.qaprosoft.onliner.utils;

public enum ConstructionTypes {
	
	SIDE_BY_SIDE("side by side"),
	FRANCHE_DOOR("французская дверь"),
	FREEZER("морозильник");
	
	private String constrType;
	
	ConstructionTypes (String constrType) {
		this.constrType = constrType;
	}
	
	public String constrType() {
		return constrType;
	}
}
