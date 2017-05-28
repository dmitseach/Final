package com.qaprosoft.onliner.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qaprosoft.carina.core.foundation.UITest;
import com.qaprosoft.onliner.dao.*;
import com.qaprosoft.onliner.objects.*;
import com.qaprosoft.onliner.pages.*;
import com.qaprosoft.onliner.utils.*;

public class OnlinerSampleTests extends UITest {
	
	@Test
	public void testFridgeModel() throws InterruptedException
	{
		FridgeDAO fridgeDAO = new FridgeDAO();
		Fridge fridge = fridgeDAO.getFridgeById(1);
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		ModelsPage modelsPage = homePage.selectSection(Products.FRIDGES.product());
		modelsPage.setBrandOrCoolSystOrOSOrDisplayCheckBox(Brands.SAMSUNG.brand());
		modelsPage.setBrandOrCoolSystOrOSOrDisplayCheckBox(CoolingSystems.FULL_NO_FROST.coolSyst());
		modelsPage.setColourCheckBox(Colours.SILVER.colour());
		modelsPage.setConstrTypeOrResolutionOrYearCheckBox(ConstructionTypes.SIDE_BY_SIDE.constrType());
		Thread.sleep(3000);
		//ProductPage productPage = modelsPage.chooseModel(Models.F_RS57K4000SA.model());
		ProductPage productPage = modelsPage.chooseModel(Brands.SAMSUNG.brand());
		Assert.assertEquals(productPage.getColourInfo(), fridge.getFridgeColour());
		Assert.assertEquals(productPage.getConstrTypeInfo(), fridge.getFridgeConstrType());
		Assert.assertEquals(productPage.getCoolSystInfo(), fridge.getFridgeCoolSyst());
		Assert.assertEquals(productPage.getBrandInfo().contains(fridge.getFridgeBrand()), true);
	}
	
	@Test
	public void testPhoneModel() throws InterruptedException
	{
		PhoneDAO phoneDAO = new PhoneDAO();
		Phone phone = phoneDAO.getPhoneById(1);
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		ModelsPage modelsPage = homePage.selectSection(Products.MOBILE_PHONES.product());
		modelsPage.setBrandOrCoolSystOrOSOrDisplayCheckBox(Brands.SAMSUNG.brand());
		modelsPage.setBrandOrCoolSystOrOSOrDisplayCheckBox(OperatingSystems.ANDROID.os());
		modelsPage.setBrandOrCoolSystOrOSOrDisplayCheckBox(DisplayTechnologies.AMOLED.display());
		modelsPage.setConstrTypeOrResolutionOrYearCheckBox(Years.Y_2017.year());
		modelsPage.setConstrTypeOrResolutionOrYearCheckBox(Resolutions.R_1080x1920.resolution());
		Thread.sleep(3000);
		ProductPage productPage = modelsPage.chooseModel(Models.P_GALAXYA5.model());
		Assert.assertEquals(productPage.getOSInfo(), phone.getPhoneOS());
		Assert.assertEquals(productPage.getYearInfo().contains(phone.getPhoneYear()), true);
		Assert.assertEquals(productPage.getResolutionInfo(), phone.getPhoneResolution());
		Assert.assertEquals(productPage.getDisplayInfo(), phone.getPhoneDisplay());
		Assert.assertEquals(productPage.getBrandInfo().contains(phone.getPhoneBrand()), true);
	}

}
