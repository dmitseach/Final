package com.qaprosoft.onliner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ProductPage extends AbstractPage {
	@FindBy(xpath = "//td[contains(text(), 'Конструкция')]/following-sibling::td/span")
	private ExtendedWebElement constrTypeInfo;
	
	@FindBy(xpath = "//td[contains(text(), 'Операционная система')]/following-sibling::td/span")
	private ExtendedWebElement osInfo;
	
	@FindBy(xpath = "//td[contains(text(), 'Дата')]/following-sibling::td/span")
	private ExtendedWebElement yearInfo;
	
	@FindBy(xpath = "//td[contains(text(), 'Разрешение')]/following-sibling::td/span")
	private ExtendedWebElement resolutionInfo;
	
	@FindBy(xpath = "//td[contains(text(), 'Технология экрана')]/following-sibling::td/span")
	private ExtendedWebElement displayInfo;
	
	@FindBy(xpath = "//td[contains(text(), 'Система охлаждения')]/following-sibling::td/span")
	private ExtendedWebElement coolSystInfo;
	
	@FindBy(xpath = "//td[contains(text(), 'Цвет')]/following-sibling::td/span")
	private ExtendedWebElement colourInfo;
	
	@FindBy(xpath = "//div[@id='container']//h1")
	private ExtendedWebElement brandInfo;
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public String getConstrTypeInfo()
	{
		assertElementPresent(constrTypeInfo);
		return constrTypeInfo.getText();
	}
	
	public String getYearInfo()
	{
		assertElementPresent(yearInfo);
		return yearInfo.getText();
	}
	
	public String getDisplayInfo()
	{
		assertElementPresent(displayInfo);
		return displayInfo.getText();
	}
	
	public String getResolutionInfo()
	{
		assertElementPresent(resolutionInfo);
		return resolutionInfo.getText();
	}
	
	public String getOSInfo()
	{
		assertElementPresent(osInfo);
		return osInfo.getText();
	}
	
	public String getCoolSystInfo()
	{
		assertElementPresent(coolSystInfo);
		return coolSystInfo.getText();
	}

	public String getColourInfo()
	{
		assertElementPresent(colourInfo);
		return colourInfo.getText();
	}
	
	public String getBrandInfo()
	{
		return brandInfo.getText();
	}
}
