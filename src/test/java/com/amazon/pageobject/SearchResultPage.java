package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class SearchResultPage 
{

	WebDriver ldriver;

	public SearchResultPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/h2/a/span")WebElement searchresult;
	//JavascriptExecutor js =(JavascriptExecutor)ldriver;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/span/a/div/img")WebElement itemselection;
	@FindBy(xpath="//a[normalize-space()='2']")WebElement nextpage;
	
	/*
	 * public void scrolldown() { js.executeScript("window.scroll(0,500)"); }
	 */
	public String gettext()
	{
		return(searchresult.getText());
	}
	public void click_product()
	{
		itemselection.click();
	}
	public void click_nextpage()
	{
		nextpage.click();
	}
	
}
