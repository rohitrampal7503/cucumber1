package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDriven
{
	WebDriver driver;
	@Given("^User is on Tower site$")
	public void user_is_on_Tower_site()  
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www-tst.towerhobbies.de/LogonForm?catalogId=12051&myAcctMain=1&langId=-3&storeId=30001&sourceDomain=hheu-de");

	}	
	

	@When("^user enter \"([^\"]*)\" Email$")
	public void user_enter_Email(String arg1) throws Throwable {
	driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys(arg1);
	}

	@When("^user enter a \"([^\"]*)\" Password$")
	public void user_enter_a_Password(String arg1) throws Throwable {
	driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")).sendKeys(arg1);
	}

	
	
	@When("^User click Sign in button$")
	public void user_click_Sign_in_button()
	{
		driver.findElement(By.id("WC_AccountDisplay_links_2")).click();
	}

	@Then("^Sign In successfully$")
	public void Sign_In_successfully() 
	{
		
	}
}
