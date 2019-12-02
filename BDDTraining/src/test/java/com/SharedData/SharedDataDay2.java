package com.SharedData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SharedDataDay2 
{
	WebDriver driver;
	public SharedDataDay2(SharedClass share)
	{
		driver=share.setup();
	}
	
	@When("^User enters \"([^\"]*)\" password1$")
	public void user_enters_password(String arg1)
	{

		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")).sendKeys(arg1);
	}
	
	@Then("User password is present")
	public void User_password_is_present()
	{
		
	}

	
}
