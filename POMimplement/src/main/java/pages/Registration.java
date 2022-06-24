package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Registration {
	
	@FindBy(name="fld_username") 
	@CacheLookup WebElement userNameTextBox;
	@FindBy(name="fld_email") 
	@CacheLookup WebElement emailTextBox;
	@FindBy(name="fld_password") 
	@CacheLookup WebElement passwordTextBox;
	@FindBy(how =How.NAME, using="fld_cpassword") 
	@CacheLookup WebElement confirmPasswordTextox;


	
	
	public void enterUserName() {
		
		userNameTextBox.sendKeys("Testing");
		
	}
	
	public void enterEmail() {
		
		emailTextBox.sendKeys("Testing");
		
	}
	
	public void enterPass() {
		
		passwordTextBox.sendKeys("abcd1234");
		
	}
	
	public void enterConfirmPass() {
		confirmPasswordTextox.sendKeys("abcd1234");
	}
	
	public void selectAddressTypeHome() {
		
	}

}
