package TestNgprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class login 
{
	WebDriver driver;
@BeforeMethod
	public void loginpage()
	{
		 driver = new ChromeDriver();
        driver.get("https://www.Facebook.com/ ");
       Reporter.log("Successful launching");
	}
@Test
public void details()
{
	  WebElement e1= driver.findElement(By.id("email"));
      e1.sendKeys("kalyanimshende@gmail.com");
      WebElement e2=driver.findElement(By.id("pass"));
     e2. sendKeys("kalyani@90");
     WebElement e3=driver.findElement(By.name("login"));
      e3.click();
      Reporter.log("Entering the vaild details");

}

}
