package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.*;

public class SignInPage 
{
	WebDriver ldriver;

	public SignInPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement element;


	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span") 
	WebElement signin;
	
	public void action()
	{
		Actions action= new Actions(ldriver);
		action.moveToElement(element).perform();
	}

	public void clickonsignin() 
	{
		signin.click();
	}



}
