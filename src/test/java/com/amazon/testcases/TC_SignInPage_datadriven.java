package com.amazon.testcases;
import com.amazon.pageobject.SignInPage;

//import org.testng.Assert;//import com.amazon.pageobject.MyAccount;//import com.amazon.pageobject.CreateAccount;//import com.amazon.pageobject.VerifyLoginName;
import com.amazon.pageobject.YourAccountPage;
import com.amazon.pageobject.YoursOrders;
import com.amazon.utilities.ReadExcelFile;
import com.amazon.pageobject.LogINPage;
import com.amazon.pageobject.PaswrdPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.amazon.pageobject.YourOrderModeule;
import com.amazon.pageobject.Address;
import com.amazon.pageobject.NewAddress;
import com.amazon.pageobject.AddNewAddress;
import com.amazon.pageobject.YourPayment;
import com.amazon.pageobject.AddPayment;
import com.amazon.pageobject.PaymentCard ;
public class TC_SignInPage_datadriven extends BaseClass
{
	@Test(dataProvider="LoginDataProvider")
	
	public void signin(String username,String Password) throws InterruptedException 
	{
		SignInPage signin = new SignInPage(driver);
		signin.action();
		signin.clickonsignin();
		LogINPage page = new LogINPage(driver);
		page.enter_email(username);
		page.press_buton();
		PaswrdPage pswrdpage= new PaswrdPage(driver);
		pswrdpage.enter_passwrd(Password);
		pswrdpage.remember_chkbox();
		pswrdpage.press_signinbutn();
		Thread.sleep(2000);
		YourAccountPage hover = new YourAccountPage(driver);
		hover.action();
		hover.click_signout();
	}
	
	
	@Test(enabled=false)
	public void signin() throws InterruptedException 
	{
		SignInPage signin = new SignInPage(driver);
		signin.action();
		signin.clickonsignin();
		//MyAccount account = new MyAccount(driver);
		// account.clickonsignin();
		/*
		 * CreateAccount accounts= new CreateAccount(driver);
		 * accounts.enter_usrname("kaps123"); accounts.enter_emailid("647");
		 * accounts.enter_paswrd("abcdef"); accounts.enter_paswrdchk("abcdef");
		 * accounts.contnue(); Thread.sleep(2000);
		 */
		LogINPage page = new LogINPage(driver);

		page.enter_email("hsh");
		page.press_buton();

		PaswrdPage pswrdpage= new PaswrdPage(driver);
		pswrdpage.enter_passwrd("dsh");
		pswrdpage.remember_chkbox();
		pswrdpage.press_signinbutn();
		Thread.sleep(2000);
		//VerifyLoginName lgname = new VerifyLoginName(driver); 
		//String name=lgname.getUsername();
		//Assert.assertEquals("Hello, kapil Account & Lists", name);;
		YourAccountPage hover = new YourAccountPage(driver);
		hover.action();
		hover.click_youraccount();
		
		YoursOrders ordr=new YoursOrders(driver);
		ordr.click_on_order();
		YourOrderModeule mdule = new YourOrderModeule(driver);		
		mdule.clck();
		mdule.enter_list();
		mdule.click_buyagain();
		mdule.click_notshipped();
		mdule.click_cancelled();		
		Thread.sleep(4000);
		}
	@Test(enabled=false)
	public void address() throws InterruptedException
	{
		SignInPage signin = new SignInPage(driver);
		signin.action();
		signin.clickonsignin();
		LogINPage page = new LogINPage(driver);
		page.enter_email("kumar.kapil083@gmail.com");
		page.press_buton();
		PaswrdPage pswrdpage= new PaswrdPage(driver);
		pswrdpage.enter_passwrd("Qwerty_6911");
		pswrdpage.remember_chkbox();
		pswrdpage.press_signinbutn();
		Thread.sleep(4000);
		YourAccountPage hover = new YourAccountPage(driver);
		hover.action();
		hover.click_youraccount();
		Address  addrs= new Address(driver);
		addrs.click_addressmenu();
		NewAddress adrs = new NewAddress(driver);
		adrs.click_newaddress();
		AddNewAddress addadres= new AddNewAddress(driver);
		addadres.click_drpdwnmenu();
		addadres.select_country("Canada");
		Thread.sleep(1500);
		addadres.enter_fullname("priya arora");
		addadres.enter_phonenumber("4168786235");
		addadres.enter_Streetadress("14 Fountainview Way");
		addadres.enter_cityname("Brampton");
		Thread.sleep(2500);
		addadres.click_citydrpdwn();
		addadres.select_province("Ontario");
		addadres.enter_postalcode("L6S 6K4");
		addadres.click_checkbox();
		addadres.click_prefrence();
		Thread.sleep(2500);
		addadres.press_houseoption();		
		addadres.click_radiobuton();
		Thread.sleep(2500);
		addadres.click_appartment();
		addadres.enter_code("1989");
		addadres.click_bussiness();				
		addadres.click_timing(10);
		addadres.click_droptiming(12);
		addadres.click_button();
		addadres.click_option();
		Thread.sleep(2500);
		addadres.press_addtionalbutton();
		Thread.sleep(2500);
		addadres.enter_text("please deliver this parcel on time");
		
		addadres.click_addbutton();
		
		
		Thread.sleep(10000);
		
		
	}
	@Test(enabled = false)
	public void payment() throws InterruptedException
	{
		SignInPage signin = new SignInPage(driver);
		signin.action();
		signin.clickonsignin();
		LogINPage page = new LogINPage(driver);
		page.enter_email("kumar.kapil083@gmail.com");
		page.press_buton();
		PaswrdPage pswrdpage= new PaswrdPage(driver);
		pswrdpage.enter_passwrd("Qwerty_6911");
		pswrdpage.remember_chkbox();
		pswrdpage.press_signinbutn();
		Thread.sleep(4000);
		YourAccountPage hover = new YourAccountPage(driver);
		hover.action();
		hover.click_youraccount();
		YourPayment paymnt= new YourPayment(driver);
		paymnt.click_paymentmodule();	
		Thread.sleep(4000);
		AddPayment newcard= new AddPayment(driver);
		newcard.click_newcard();
		Thread.sleep(2000);			
		newcard.press_newcard();
		Thread.sleep(5000);	
		//PaymentCard pymntcrd = new PaymentCard(driver);
		//pymntcrd.enter_newframe();
		//pymntcrd.enter_details();
		
		Thread.sleep(4000);
		
	}
	@DataProvider(name="LoginDataProvider")
	public String[][]LoginDataProvider()
	{
		String fileName = System.getProperty("user.dir") + "\\TestData\\TestDataFile.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;
	}
	}
	





