package com.amazon.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

public class AddNewAddress 
{	

	WebDriver ldriver;
	
	public AddNewAddress(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//span[@role='button']")WebElement drpdwn;
	@FindBy(xpath="//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//ul[@role='listbox']//li//a")List <WebElement> list;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")WebElement fullname;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")WebElement phonenum;
	@FindBy(id="address-ui-widgets-enterAddressLine1")WebElement streetadrs;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressCity\"]")WebElement city;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")WebElement prvncdrpdwn;
	@FindBy(xpath="//ul[@role='listbox']//li//a")List <WebElement> listprovince;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")WebElement pstlcode;
	@FindBy(xpath="//input[@id='address-ui-widgets-use-as-my-default']")WebElement chkbox;
 	@FindBy(xpath="//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']") WebElement buton;
 	@FindBy(xpath="//span[contains(text(),'Add preferences, notes, access codes and more')]")WebElement adprefrence;
 	@FindBy(xpath="//button[normalize-space()='House']")WebElement house;
 	@FindBy(xpath="//*[@id=\"address-ui-widgets-delivery-instructions-desktop-widget-html-container\"]/div/div/div[1]/div[3]/div[1]/div/div/div/span")List <WebElement> radiobtn;
 	@FindBy(xpath="//button[normalize-space()='Apartment']")WebElement aprtmnt;
 	@FindBy(xpath="//div[@class='a-section ma-property-type-form-block ma-apartment-form-block ma-form-section-without-spacing']//input[@placeholder='Security code for the door']")WebElement secutycode;
 	@FindBy(xpath="//button[normalize-space()='Business']") WebElement busines;
 	@FindBy(xpath="//select[@id='business_hours_start_weekday_delivery-instructions-cdpViewId_BUSINESS']")WebElement hourspick;
  	@FindBy(xpath="//select[@id='business_hours_stop_weekday_delivery-instructions-cdpViewId_BUSINESS']")WebElement hoursdrop;
 	@FindBy(id="exceptionDatesOpen-announce")WebElement btn;
 	@FindBy(xpath="//button[normalize-space()='Other']") WebElement optn;
 	@FindBy(xpath="//*[@id=\"address-ui-widgets-delivery-instructions-desktop-widget-html-container\"]/div/div/div[1]/div[6]/div[4]/a/span/div/div[1]")WebElement adtnlint;
 	@FindBy(xpath="//*[@id=\"address-ui-widgets-delivery-instructions-desktop-widget-html-container\"]/div/div/div[1]/div[6]/div[4]/div/div/span/div/textarea")WebElement textarea;
 	public void click_drpdwnmenu()
	{
		drpdwn.click();
	}
	public void select_country(String cntry)
	{
		for(WebElement obj:list)
		{
			if(obj.getText().contains(cntry))
			{
				obj.click();
				break;
			}
		}
	}	
	public void enter_fullname(String fname)
	{
		fullname.sendKeys(fname);
	}
	public void enter_phonenumber(String number)
	{
		phonenum.sendKeys(number);
	}
	public void enter_Streetadress(String sadress)
	{
		streetadrs.sendKeys(sadress);
	}
	public void enter_cityname(String cityname)
	{
		city.sendKeys(cityname);
	}
	public void click_citydrpdwn()
	{
		prvncdrpdwn.click();
	}
	public void select_province(String provnc)
	{
		for(WebElement obj1:listprovince)
		{
			if(obj1.getText().contains(provnc))
			{
				obj1.click();
				break;
			}
		}
	}
	public void enter_postalcode(String pstlcde)
	{
		pstlcode.sendKeys(pstlcde);
	}
	public void click_checkbox()
	{
		chkbox.click();
	}
	public void click_addbutton()
	{
		buton.click();
	}
	public void click_prefrence()
	{
		adprefrence.click();
	}
	public void press_houseoption()
	{
		house.click();
	}
	public void click_radiobuton()
	{
		for(WebElement obj2:radiobtn)
		{
			if(obj2.getText().equals("FRONTDOOR"))
			{
				obj2.click();
			}
		}
	}
	public void click_appartment()
	{
		aprtmnt.click();
	}
	public void enter_code(String cde)
	{
		secutycode.sendKeys(cde);
	}
	public void click_bussiness()
	{
		busines.click();
	}
	
	public void click_timing(int value)
	{
		Select slct= new Select(hourspick);
		slct.selectByIndex(value);
	}
	public void click_droptiming(int time)
	{
		Select slct= new Select(hoursdrop);
		slct.selectByIndex(time);
	}
	public void click_button()
	{
		btn.click();
	}
	public void click_option()
	{
		optn.click();
	}
	public void press_addtionalbutton()
	{
		adtnlint.click();
	}
	public void enter_text(String text)
	{
		textarea.sendKeys(text);
	}
	
}


