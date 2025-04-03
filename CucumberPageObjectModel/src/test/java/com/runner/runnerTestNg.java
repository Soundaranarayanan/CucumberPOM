package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features/LoginPage.feature",
		glue = "com.definitions",
		plugin = {
				"pretty",
				"html:target/cucumber-reports.html",
				"json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		monochrome =true)

public class runnerTestNg extends AbstractTestNGCucumberTests {

}
