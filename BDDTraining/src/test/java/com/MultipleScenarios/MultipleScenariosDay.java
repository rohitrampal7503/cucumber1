package com.MultipleScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class MultipleScenariosDay
{
	WebDriver driver;

	@Given("^User Open site1 \"([^\"]*)\"$")
	public void user_Open_site1(String arg1) throws Throwable {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(arg1);

	}

}
