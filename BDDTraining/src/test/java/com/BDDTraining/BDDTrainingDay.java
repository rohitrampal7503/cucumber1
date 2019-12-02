package com.BDDTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BDDTrainingDay
{
	WebDriver driver;
	@Given("^User is on TowerH site$")
	public void user_is_on_TowerH_site()  
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www-tst.towerhobbies.de/LogonForm?catalogId=12051&myAcctMain=1&langId=-3&storeId=30001&sourceDomain=hheu-de");

	}

	@When("^User enters Email Id$")
	public void user_enters_Email_Id()  
	{
		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys("08122019@horizonhobby.com");
	}

	@When("^User enters Password$")
	public void user_enters_Password() 
	{

		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")).sendKeys("oda2014!");
	}

	@When("^User clicks Sign in$")
	public void user_clicks_Sign_in()
	{
		driver.findElement(By.id("WC_AccountDisplay_links_2")).click();
	}

	@Then("^User Sign In successfully$")
	public void user_Sign_In_successfully() 
	{
		
	}
}
