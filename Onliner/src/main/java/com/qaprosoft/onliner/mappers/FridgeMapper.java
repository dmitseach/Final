package com.qaprosoft.onliner.mappers;

import java.util.List;

import com.qaprosoft.onliner.objects.Fridge;

public interface FridgeMapper {

	public Fridge getFridgeById(Integer id);

	public List<Fridge> getAllFridges();

}
