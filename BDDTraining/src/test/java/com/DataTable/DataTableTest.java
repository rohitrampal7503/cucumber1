package com.DataTable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		dryRun=false,
		
		features= {"src/resources/com/basic/DataTableFF/"},
		glue= {"com/DataTable/"},
		
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report4.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
		}
)
public class DataTableTest
{

}
