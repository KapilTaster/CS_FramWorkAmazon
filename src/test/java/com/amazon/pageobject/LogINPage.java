package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogINPage 
{
	WebDriver ldriver;
	
	
	public LogINPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="ap_email")WebElement emailid;
	@FindBy(id="continue")WebElement cntuebtn;
	
	
	public void enter_email(String email)
	{
		emailid.sendKeys(email);
	}
	public void press_buton()
	{
		cntuebtn.click();
	}
}
