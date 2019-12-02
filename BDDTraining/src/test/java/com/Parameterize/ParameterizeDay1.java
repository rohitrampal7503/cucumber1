package com.Parameterize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterizeDay1
{
	WebDriver driver;
	@Given("^User is on TowerH site$")
	public void user_is_on_TowerH_site()  
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www-tst.towerhobbies.de/LogonForm?catalogId=12051&myAcctMain=1&langId=-3&storeId=30001&sourceDomain=hheu-de");

	}

	@When("^User enters \"([^\"]*)\" Email Id$")
	public void user_enters_Email_Id(String email)  
	{
		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys(email);
	}

	@When("^User enters \"([^\"]*)\" password$")
	public void user_enters_Password(String password) 
	{

		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")).sendKeys(password);
	}


	@Then("^User Sign In successfully$")
	public void user_Sign_In_successfully() 
	{
		
	}
	
	
	@Then("User Email is present")
	public void User_Email_is_present()
	{
		
	}
	
	@Then("User password is present")
	public void User_password_is_present()
	{
		
	}
}
