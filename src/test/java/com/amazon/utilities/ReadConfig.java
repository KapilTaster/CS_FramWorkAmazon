package com.amazon.utilities;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadConfig 

{
	Properties properties;
	String path="C:\\Users\\kumar\\eclipse-workspace\\Framework\\configuration\\config.properties";

	public ReadConfig() 
	{
		try 
		{
			properties = new Properties();   

			FileInputStream fil = new FileInputStream(path);
			properties.load(fil);
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

	public String geturl() 
	{
		String gturl = properties.getProperty("baseurl");
		//Thread.sleep(2000);
		if(gturl!= null)
			return gturl;
		else
			throw new RuntimeException("URl not Specified");
	}
	public String getbrowser()
	{
		String brwsr= properties.getProperty("browser");
		if(brwsr!= null)
			return brwsr;
		else
			throw new RuntimeException("Browser not Specified");
	}
}
