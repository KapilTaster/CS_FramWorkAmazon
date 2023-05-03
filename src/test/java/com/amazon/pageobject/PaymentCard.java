package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentCard 
{
	WebDriver ldriver;

	public PaymentCard(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//iframe[@id='pp-BZ9up0-33']")WebElement frame;
	@FindBy(xpath="//*[@id=\"pp-GDQDFP-25\"]")WebElement carddetail;
	
	
	public void enter_newframe()
	{
		ldriver.switchTo().frame(frame);
	}
	public void enter_details()
	{
		carddetail.click();
	}

}
