package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoursOrders
{
		WebDriver ldriver;
		
		public YoursOrders(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/div/span")WebElement urordr;
		
		
		public void click_on_order()
		{
			urordr.click();
		}
}
