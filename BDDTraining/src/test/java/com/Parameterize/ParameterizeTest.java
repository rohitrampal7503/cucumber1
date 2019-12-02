package com.Parameterize;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		dryRun=false,
		
		features= {"src/resources/com/basic/ParameterizeFF/"},
		glue= {"com/Parameterize/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report7.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
		}
)
public class ParameterizeTest
{

}
