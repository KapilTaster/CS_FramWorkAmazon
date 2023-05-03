package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPayment
{
	WebDriver ldriver;

	public AddPayment(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@id=\"cpefront-mpo-widget\"]/div/div[2]/div[3]/div/div[1]/div[3]")WebElement addcard;
	
	@FindBy(xpath="//*[@id=\"apx-add-credit-card-action-test-id\"]")WebElement addnewcard;
	

	public void click_newcard()
	{
		addcard.click();
	}
	
	public void press_newcard()
	{
		
		addnewcard.click();
	}
}
