package org.hcl.web.base;

import java.io.IOException;
import java.time.Duration;

import org.hcl.web.library.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InitiateBrowser {

	public static WebDriver driver;	

	public static WebDriver startBrowser() throws IOException {
		boolean a = true;
		if(PropertyReader.readPropjectConf("environment").equalsIgnoreCase("QA")){
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin Tyagi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get(PropertyReader.readPropjectConf("ApplicationURL"));
				return driver;
		}
		else if(PropertyReader.readPropjectConf("environment").equalsIgnoreCase("UAT")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nitin Tyagi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(PropertyReader.readPropjectConf("ApplicationURLUAT"));
			return driver;
	   }
		return driver;
	}
	

	public void closeBrowser() {
		//driver.close(); 
	}
	
}
