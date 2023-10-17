package org.hcl.web.validations;

import org.hcl.web.base.InitiateBrowser;
import org.openqa.selenium.By;


public class PageValidations extends InitiateBrowser{
	
	
	public static void validatePageURL(String expectedURL) {
		org.junit.Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
	}
	
	
	public static void validatePageTitle(String expectedTitle) {
		org.junit.Assert.assertEquals(expectedTitle,driver.getTitle());
	}
	
	public static void validateTextOnPage(String expectedText) {
		
		if(driver.getPageSource().contains(expectedText)) {
			org.junit.Assert.assertTrue(true);
		}
		else {
			org.junit.Assert.assertTrue(false);
		}

		
	}
	
	public static void validateElementOnPage(String xpath) {
		
		try{
			driver.findElement(By.xpath(xpath));
			org.junit.Assert.assertTrue(true);
		}
		catch(Exception e){
			org.junit.Assert.assertTrue(false);
		}
	}

}
