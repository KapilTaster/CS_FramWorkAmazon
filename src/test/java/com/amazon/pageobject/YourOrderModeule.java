package com.amazon.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class YourOrderModeule
{
	WebDriver ldriver;
	public YourOrderModeule(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(className="a-dropdown-prompt")WebElement ddown;
	@FindBy(xpath="//ul[@class='a-nostyle a-list-link']/li")List <WebElement> list;
	@FindBy(xpath="//*[@id=\"orderTypeMenuContainer\"]/ul/li[3]/span/a")WebElement byagn;
	@FindBy(xpath="//a[normalize-space()='Not Yet Shipped']")WebElement notship; 
	@FindBy(xpath="//a[normalize-space()='Cancelled Orders']")WebElement cancel;

	public void clck()
	{
		ddown.click();
	}
	public void enter_list()
	{
		for(WebElement elmnt : list)
		{
			if(elmnt.getText().equals("2015"))
			{
				elmnt.click();
				break;
			}
		}
	}
	public void click_buyagain()
	{
		byagn.click();
	}
	public void click_notshipped()
	{
		notship.click();
	}
	public void click_cancelled()
	{
		cancel.click();
	}

}
