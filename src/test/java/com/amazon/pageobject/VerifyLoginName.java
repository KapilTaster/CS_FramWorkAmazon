package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLoginName 
{
	WebDriver ldriver;


	public VerifyLoginName(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]") WebElement username;

	public String getUsername()
	{
		String text= username.getText();
		return text;
	}
}
