package com.openMRS.pages;

import org.openqa.selenium.By;


import com.openMRS.parentPage.Page;

public class IsolationWardPage extends Page{
	
	
	
	
	public void registerPatient()
	{
		driver.findElement(By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")).click();
		
	}
	public void activeVisits()
	{
		
		
	}
	
	public void findPatientRecord()
	{
		
		
		
	}
	
	public IsolationWardPage appointmentSheduling()
	{
		
		driver.findElement(By.xpath("//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]")).click();
		return new IsolationWardPage();
	}
	
}
