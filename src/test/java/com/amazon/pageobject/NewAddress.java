package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddress 
{
	WebDriver ldriver;
	
	public NewAddress(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//h2[normalize-space()='Add Address']")WebElement adrs;
	
	public void click_newaddress()
	{
		adrs.click();
	}
	
}
