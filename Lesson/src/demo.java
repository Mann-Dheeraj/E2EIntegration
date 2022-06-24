import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new SafariDriver();
		
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
	}

}


