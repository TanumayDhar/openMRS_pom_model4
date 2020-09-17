package com.openMRS.parentPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
	
	
	
	WebDriver driver;
	
	
	public TopMenu(WebDriver driver)
	
	{
		
		this.driver = driver;
	}
	
	



	public void LogOut()
	{

		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();	

	}

	public void admin()
	{


	}

	public void openMRSIcon ()

	{


	}


}
