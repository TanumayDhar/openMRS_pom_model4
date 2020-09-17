package com.openMRS.parentPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {


	public static WebDriver driver;
	
	public static TopMenu menu ;
	

	public Page ()


	{
		if(driver==null) 

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("https://demo.openmrs.org/openmrs/login.htm");
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			 
			menu = new TopMenu(driver);


		}

	}
}
