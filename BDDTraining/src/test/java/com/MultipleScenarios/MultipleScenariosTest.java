package com.MultipleScenarios;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		dryRun=false,
		
		features= {"src/resources/com/basic/MultipleScenariosFF/"},
		glue= {"com/MultipleScenarios/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
		}
)
public class MultipleScenariosTest
{

}
