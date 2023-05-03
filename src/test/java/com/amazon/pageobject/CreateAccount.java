package com.amazon.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount 
{
	WebDriver ldriver;

	public CreateAccount(WebDriver rdriver) 
	
	{		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="ap_customer_name")WebElement name;
	@FindBy(id="ap_email") WebElement email;
	@FindBy(xpath="//input[@id='ap_password']")WebElement passwrd;
	@FindBy(id="ap_password_check") WebElement pswrdchk;
	@FindBy(id="continue")WebElement buton;
	
	
	public void enter_usrname(String uname)
	{
		name.sendKeys(uname);
		
	}
	public void enter_emailid(String uemail)
	{
		email.sendKeys(uemail);
		
	}
	public void enter_paswrd(String password)
	{
		passwrd.sendKeys(password);
		
	}
	public void enter_paswrdchk(String pwdagn)
	{
		pswrdchk.sendKeys(pwdagn);
		
	}
	public void contnue()
	{
		buton.click();
		
	}
	
}
