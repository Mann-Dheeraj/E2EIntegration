package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginPage {
	
	
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "./chromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://thetestingworld.com/testings");
		driver.findElement(By.xpath("//label[text()='Login']//parent::li")).click();
		driver.findElement(By.name("_txtUserName")).sendKeys("Testing");
		
	}

}
