package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItem 
{

	WebDriver ldriver;

	public SearchItem(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")WebElement searchbox;
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")WebElement searchbtn;
	
	
	public void enter_item(String item)
	{
		searchbox.sendKeys(item);
	}
	public void click_button()
	{
		searchbtn.click();
	}
	
	
}
