package base;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InstanciateDriver {
	
	public WebDriver driver;
	
	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "./chromeDriver/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://thetestingworld.com/testings");
		
		
		
	}
	
	
	@AfterTest
	public void out() {
		driver.close();
	}

}
