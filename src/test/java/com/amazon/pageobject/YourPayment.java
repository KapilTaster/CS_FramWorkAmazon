package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourPayment
{
	WebDriver ldriver;
	
	public YourPayment(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage or add payment methods and view your transa')]")WebElement paymnt;
	
	
	public void click_paymentmodule()
	{
		paymnt.click();
	}
}
