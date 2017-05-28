package com.qaprosoft.onliner.objects;

public class Fridge {
	private long id;
	private String model;
	private String brand;
	private String colour;
	private String coolSyst;
	private String constrType;

	public Fridge(long id, String model, String brand, String colour, String coolSyst, String constrType) {
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.colour = colour;
		this.coolSyst = coolSyst;
		this.constrType = constrType;
	}

	public Fridge() {
	}

	public long getFridgeId() {
		return id;
	}

	public String getFridgeModel() {
		return model;
	}

	public String getFridgeBrand() {
		return brand;
	}

	public String getFridgeColour() {
		return colour;
	}

	public String getFridgeCoolSyst() {
		return coolSyst;
	}

	public String getFridgeConstrType() {
		return constrType;
	}

}
