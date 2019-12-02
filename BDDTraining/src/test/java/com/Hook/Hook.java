package com.Hook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hook
{
	WebDriver driver;
	
	@Before(order=2)
	public void setup()
	{
		System.out.println("Before 1");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www-tst.towerhobbies.de/LogonForm?catalogId=12051&myAcctMain=1&langId=-3&storeId=30001&sourceDomain=hheu-de");

	}
	
	@Before(order=1)
	public void setup1()
	{
		System.out.println("Before 2");
	}
	
	@Given("^User is on TowerH site$")
	public void user_is_on_TowerH_site()  
	{
		
	}

	@When("^User enters \"([^\"]*)\" Email Id$")
	public void user_enters_Email_Id(String email)  
	{
		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys(email);
	}

	@When("^User enters \"([^\"]*)\" password1$")
	public void user_enters_password(String arg1)
	{

		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")).sendKeys(arg1);
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
	
	@After(order=2)
	public void clean()
	{
		System.out.println("After 1");
		driver.quit();
	}
	
	@After(order=1)
	public void clean1()
	{
		System.out.println("After 2");

	}
}
