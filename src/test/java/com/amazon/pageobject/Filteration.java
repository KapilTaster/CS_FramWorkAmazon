package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filteration 
{

	WebDriver ldriver;

	public Filteration(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-2']")WebElement rating;
	@FindBy(xpath="//*[@id=\"p_89/Under Armour\"]/span/a/span")WebElement brand;
	@FindBy(xpath="//*[@id=\"high-price\"]")WebElement maxprize;
	@FindBy(xpath="//*[@id=\"a-autoid-5\"]/span/input")WebElement gobutton;
	
	public void select_rating()
	{
		rating.click();
	}
	public void select_brand()
	{
		brand .click();
	}
	public void enter_maxprize(String amount)
	{
		maxprize.sendKeys(amount);
	}
	public void press_gobutton()
	{
		gobutton.click();
	}
}
