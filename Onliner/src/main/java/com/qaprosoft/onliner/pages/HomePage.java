/*
 * Copyright 2013-2016 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomePage extends AbstractPage {
	
	private static final String TEMPLATE = "//div[@id='container']//a[contains(text(), '%s')]";
	
	public HomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL(Configuration.getEnvArg("onliner_url"));
	}
	
	public ModelsPage selectSection(String section) {
		String xpath = String.format(TEMPLATE, section);
		ExtendedWebElement sectionLink = new ExtendedWebElement(driver.findElement(By.xpath(xpath)));
		sectionLink.click();
		return new ModelsPage(driver);
	}
	
}
