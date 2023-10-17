package org.web.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="FeatureFiles",
		glue="org.web.testcase.steps",
		tags="@Nayak",
		plugin= {"html:target/cucumber-report/",
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt",
				"junit:target/cucumber-results.xml",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"}
		)

public class TestRunner {
	@BeforeClass
	public static void generateReport(){
		ExtentProperties extentP = ExtentProperties.INSTANCE;
		extentP.setReportPath("./Reports/Report.html");
	}

}
