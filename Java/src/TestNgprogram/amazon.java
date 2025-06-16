package TestNgprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class amazon 
{
	WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
	public void amazon1(String nameofbrowser)
	{
		if (nameofbrowser.equals("Chrome")) 
		{
			driver = new ChromeDriver();
			
		}
		if (nameofbrowser.equals("Edge")) 
		{
			driver = new EdgeDriver();
			
		}
		if (nameofbrowser.equals("Firefox")) 
		{
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Reporter.log("successful login");
		}
	
@AfterMethod
public void logout()
{
	driver.quit();
	Reporter.log("successful logout");
	
	}
}
