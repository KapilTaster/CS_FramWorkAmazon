package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount

{

	WebDriver ldriver;
	
	public MyAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="createAccountSubmit") 
	WebElement createaccount;
	
	public void clickonsignin() 
	{
		createaccount.click();
	}
	
}
