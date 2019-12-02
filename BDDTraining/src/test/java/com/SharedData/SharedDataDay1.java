package com.SharedData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SharedDataDay1
{
	WebDriver driver;
	
	public SharedDataDay1(SharedClass share)
	{
		driver=share.setup();
	}
	
	@When("^User enters \"([^\"]*)\" Email Id$")
	public void user_enters_Email_Id(String email)  
	{
	
		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys(email);
	}

	
	
	@Then("User Email is present")
	public void User_Email_is_present()
	{
		
	}
	
	
}
