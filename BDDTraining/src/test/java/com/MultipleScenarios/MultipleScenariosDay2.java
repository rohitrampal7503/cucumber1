package com.MultipleScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleScenariosDay2
{
	WebDriver driver;

	@Given("^User Open site2 \"([^\"]*)\"$")
	public void user_Open_site2(String arg1) throws Throwable {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(arg1);

	}

}
