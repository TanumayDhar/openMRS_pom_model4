package com.openMRS.testcases;
import com.isolation.ConfigureMetadata.MetaData;
import com.openMRS.pages.AppointmentSchedule;
import com.openMRS.pages.HomePage;
import com.openMRS.pages.IsolationWardPage;
import com.openMRS.pages.LoginPage;
import com.openMRS.pages.ManageServiceTypes;
import com.openMRS.pages.ServiceType;
import com.openMRS.parentPage.Page;


public class LoginPageTestCases {    // 




	public static void main(String arg []) throws InterruptedException    
	{



		HomePage hp = new HomePage(); 
		LoginPage lp = hp.goToLogin();
		lp.doLogin();
		
		/*
		 * IsolationWardPage iw = new IsolationWardPage(); iw.appointmentSheduling();
		 */
		 
		 
		

		/*
		 * LoginPage login = new LoginPage(); login.doLogin();
		 */

		/*
		 * MetaData md = new MetaData(); 
		 * md.managePatientidentifierTypes();
		 * 
		 * Page.menu.LogOut();
		 * 
		
		 * 
		 * AppointmentSchedule as = new AppointmentSchedule(); as.manageService();
		 * 
		 * ManageServiceTypes ms = new ManageServiceTypes(); ms.types();
		 * 
		 * ServiceType st = new ServiceType(); st.serviceName(); st.clickHomeIcon();
		 * 
		 * 
		 * //hp.LogOut(); hp.verifyLogoutSuccesfull();
		 * 
		 * 
		 * //Page.menu.LogOut();
		 */






	}

}
