package com.qaprosoft.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ModelsPage extends AbstractPage {
	
	private static final String BRAND_COOLSYS_OS_DISPLAY_CHECKBOXES = "//div[@id='schema-filter']//span[2][contains(text(), '%s')]";
	private static final String CONSTRTYPE_RESOLUTION_YEAR_CHECKBOXES = "//div[@id='schema-filter']//span[contains(text(), '%s')]";
	private static final String COLOUR_MODEL_CHECKBOXES = "//div[@id='schema-products']//span[contains(text(), '%s')]";

	public ModelsPage(WebDriver driver) {
		super(driver);
	}
	
	public void setBrandOrCoolSystOrOSOrDisplayCheckBox(String checkBoxSection) {
		String xpath = String.format(BRAND_COOLSYS_OS_DISPLAY_CHECKBOXES, checkBoxSection);
		ExtendedWebElement sectionLink = new ExtendedWebElement(driver.findElement(By.xpath(xpath)));
		sectionLink.click();
	}

	public void setConstrTypeOrResolutionOrYearCheckBox(String checkBoxSection) {
		String xpath = String.format(CONSTRTYPE_RESOLUTION_YEAR_CHECKBOXES, checkBoxSection);
		ExtendedWebElement sectionLink = new ExtendedWebElement(driver.findElement(By.xpath(xpath)));
		sectionLink.click();
	}
	
	public void setColourCheckBox(String checkBoxSection) {
		String xpath = String.format(COLOUR_MODEL_CHECKBOXES, checkBoxSection);
		ExtendedWebElement sectionLink = new ExtendedWebElement(driver.findElement(By.xpath(xpath)));
		sectionLink.click();
	}
	
	public ProductPage chooseModel(String model) {
		String xpath = String.format(COLOUR_MODEL_CHECKBOXES, model);
		ExtendedWebElement sectionLink = new ExtendedWebElement(driver.findElement(By.xpath(xpath)));
		sectionLink.click();
		return new ProductPage(driver);
	}
	
}
