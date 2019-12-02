package com.DataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		dryRun=false,
		
		features= {"src/resources/com/basic/DataDrivenFF/"},
		glue= {"com/DataDriven/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report3.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
		}
)
public class DataDrivenTest
{

}
