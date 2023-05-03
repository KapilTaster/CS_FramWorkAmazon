package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.*;

public class YourAccountPage 
{
	WebDriver ldriver;
	
	public YourAccountPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id="nav-link-accountList-nav-line-1")WebElement account;
	@FindBy(xpath="//*[@id=\"nav-item-signout\"]/span")WebElement signout;
	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")WebElement uraccount;
	
	public void action()
	{
		Actions action= new Actions(ldriver);
		action.moveToElement(account).perform();
	}
	public void click_signout()
	{
		signout.click();
	}
	public void click_youraccount()
	{
		uraccount.click();
	}
}
