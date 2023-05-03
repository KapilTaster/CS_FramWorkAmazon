package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaswrdPage 
{
	WebDriver ldriver;
	
	public PaswrdPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="ap_password")WebElement passwrd;
	@FindBy(xpath="//input[@name='rememberMe']")WebElement chkbox;
	@FindBy(id="signInSubmit")WebElement signinbtn;
	
	
	public void enter_passwrd(String pswrd)
	{
		passwrd.sendKeys(pswrd);
	}
	public void remember_chkbox()
	{
		chkbox.click();
	}
	public void press_signinbutn()
	{
		signinbtn.click();
	}
}
