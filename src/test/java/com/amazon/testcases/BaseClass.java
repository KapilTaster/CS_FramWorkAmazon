package com.amazon.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import com.amazon.utilities.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	ReadConfig configfile = new ReadConfig();
	String url = configfile.geturl();
	String browser= configfile.getbrowser();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() throws InterruptedException 
	{
		switch(browser.toLowerCase())
		{
		case"chrome":

			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);
			break;
		case"firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;	
		case"msedge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			
			break;
		default:

			driver=null;
			break;
		}
		//Thread.sleep(1000);
		logger= LogManager.getLogger("Framwork");
		driver.get(url);
		Thread.sleep(2000);
		logger.info("Url Opened");
		
		driver.manage().window().maximize();

	}

	@AfterClass 
	public void teardown() 
	{ 
		//driver.quit();
		driver.close(); 
	}

}