package com.DataTable;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTable
{
	WebDriver driver;
	@Given("^User is on TowerH site$")
	public void user_is_on_TowerH_site()  
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www-tst.towerhobbies.de/LogonForm?catalogId=12051&myAcctMain=1&langId=-3&storeId=30001&sourceDomain=hheu-de");

	}

	
	@When("^Enter following data$")
	public void Enter_following_data(cucumber.api.DataTable table)
	{
		List<List<String>> data=table.raw();
		String value1=data.get(1).get(0);
		String value2=data.get(1).get(1);
		

		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys(value1);
		driver.findElement(By.id("WC_AccountDisplay_FormInput_logonPassword_In_Logon_1")).sendKeys(value2);
	}
	



	@When("^User Clicks Sign In$")
	public void User_Clicks_Sign_In()
	{
		driver.findElement(By.id("WC_AccountDisplay_links_2")).click();
	}
	
	@Then("^User Sign In successfully$")
	public void User_Sign_In_successfully()
	{
		
	}
}
