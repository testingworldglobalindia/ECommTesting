package org.hcl.web.validations;

import org.hcl.web.base.InitiateBrowser;
import org.openqa.selenium.By;


public class ElementValidations extends InitiateBrowser{
	
	
	public static void validateElementExistOnPage(String xpath) {
		try{
			driver.findElement(By.xpath(xpath));
			org.junit.Assert.assertTrue(true);
		}
		catch(Exception e){
			org.junit.Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementEnabled(String xpath) {
		try{
			if(driver.findElement(By.xpath(xpath)).isEnabled()) {
				org.junit.Assert.assertTrue(true);
			}
			else {
				org.junit.Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			org.junit.Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementVisible(String xpath) {
		try{
			if(driver.findElement(By.xpath(xpath)).isDisplayed()) {
				org.junit.Assert.assertTrue(true);
			}
			else {
				org.junit.Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			org.junit.Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementText(String xpath, String expectedText) {
		try{
			if(driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase(expectedText)) {
				org.junit.Assert.assertTrue(true);
			}
			else {
				org.junit.Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			org.junit.Assert.assertTrue(false);
		}
		
	}
	
	public static void validateElementText(String xpath, String attName,  String expectedText) {
		try{
			if(driver.findElement(By.xpath(xpath)).getAttribute(attName).equalsIgnoreCase(expectedText)) {
				org.junit.Assert.assertTrue(true);
			}
			else {
				org.junit.Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			org.junit.Assert.assertTrue(false);
		}
		
	}
	
	
}
