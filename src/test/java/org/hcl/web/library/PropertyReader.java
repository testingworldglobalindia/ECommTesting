package org.hcl.web.library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
			
		public static String readPropjectConf(String key) throws IOException {
			Properties prop = new Properties();
			FileInputStream fs = new FileInputStream("C:/Users/Nitin Tyagi/TestAutomationFolder/FMS_Automation_BDD/Configuration/ProjectConfiguration.properties");
			prop.load(fs);
			return (String) prop.get(key);
			
		}
		
		public static String readElementLocators(String key) throws IOException {
			Properties prop = new Properties();
			FileInputStream fs = new FileInputStream("C:/Users/Nitin Tyagi/TestAutomationFolder/FMS_Automation_BDD/Configuration/ElementLocators.properties");
			prop.load(fs);
			return (String) prop.get(key);
			
		}


}
