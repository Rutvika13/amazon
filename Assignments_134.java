package Selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assignments_134 
{

	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       TakesScreenshot ts=driver;
      File Source= ts.getScreenshotAs(OutputType.FILE);
      File Destination=new File("D:\\Kalyani\\GrowTechMind\\Screenshots\\facebookpage.png");
      FileHandler.copy(Source, Destination);
     
       

	}
}
