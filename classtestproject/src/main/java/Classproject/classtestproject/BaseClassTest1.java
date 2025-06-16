package Classproject.classtestproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassTest1 {
	WebDriver driver;
	
	@BeforeMethod
	public void login_in()
	{
		
		driver= new EdgeDriver();
		driver.get("https://www.amazon.in");
		WebElement accountandlist=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist);
		a1.perform();
		Reporter.log("Successfully done to account");
	}
	
	
	@AfterMethod
	public void log_out()
	{
		driver.close();
		Reporter.log("Successfully close");
	}

}
