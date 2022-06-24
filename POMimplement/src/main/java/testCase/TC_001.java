package testCase;

//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.InstanciateDriver;
import pages.Registration;

public class TC_001 extends InstanciateDriver{
	
	@Test
	public void tcase1() {
		
		//Registration register= PageFactory.initElements(driver,Registration.class);
		// or
		Registration register=new Registration();
		PageFactory.initElements(driver,register);
		
		
		register.enterUserName();
		register.enterEmail();
		register.enterPass();
		register.enterConfirmPass();
	}
	

}
