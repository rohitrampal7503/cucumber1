package com.Background;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		dryRun=false,
		
		features= {"src/resources/com/basic/BackgroundFF/"},
		glue= {"com/Background/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}
)
public class BackgroundTest
{

}
