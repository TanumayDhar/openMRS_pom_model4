package com.isolation.ConfigureMetadata;

import org.openqa.selenium.By;

import com.openMRS.parentPage.Page;

public class MetaData extends Page {



	public void managePatientidentifierTypes()
	{

		driver.findElement(By.xpath("//*[@id=\"org-openmrs-module-adminui-configuremetadata-homepageLink-org-openmrs-module-adminui-configuremetadata-homepageLink-extension\"]")).click();
		//menu.LogOut();
	}

	public void Locations()
	{

		System.out.println("Find a location");
		menu.LogOut();
	}


	public void patients()
	{





	}
	public void Visits()
	{


	}
}


