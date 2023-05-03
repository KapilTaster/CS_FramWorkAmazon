package com.amazon.pageobject;

//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProductCart 
{
	WebDriver ldriver;

	public AddProductCart(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@id=\"quantity\"]")WebElement quantity;	
	@FindBy(xpath="//*[@id=\"size_name_5\"]/span/input")WebElement selectsize;
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")WebElement addcart;
	
	public void select_quantity(String value)
	{
		Select  select=new Select(quantity);
		select.selectByValue(value);
		
	}
	
	public void size_selection()
	{
		selectsize.click();
	}
	public void click_addcart()
	{
		addcart.click();
	}

}
