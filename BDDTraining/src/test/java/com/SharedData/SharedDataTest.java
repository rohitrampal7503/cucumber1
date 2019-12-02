package com.SharedData;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		dryRun=false,
		
		features= {"src/resources/com/basic/SharedDataSD/"},
		glue= {"com/SharedData/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report8.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
		}
)
public class SharedDataTest
{

}
