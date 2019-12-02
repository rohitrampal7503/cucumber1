package com.Hook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		dryRun=false,
		
		features= {"src/resources/com/basic/HookFF/"},
		glue= {"com/Hook/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
		}
)
public class HookTest
{

}
