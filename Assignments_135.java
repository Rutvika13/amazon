package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assignments_135 
{


	public static void main(String[] args) throws IOException 
	{ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
   WebElement e1= driver.findElement(By.id("email"));
   e1.sendKeys("kalyanimshende@gmail.com");
   WebElement e2=driver.findElement(By.id("pass"));
  e2. sendKeys("kalyani@90");
  WebElement e3=driver.findElement(By.name("login"));
   e3.click();
  
   TakesScreenshot ts=driver;
  File Source= ts.getScreenshotAs(OutputType.FILE);

  File Destination= new File("  D:\\Kalyani\\GrowTechMind\\Screenshots\\Login username and pass"+Math.random()+".png");
  FileHandler.copy(Source, Destination);

		
		
	}
}
