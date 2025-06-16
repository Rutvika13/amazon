package Selenium;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignments_137 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       WebElement e1= driver.findElement(By.id("email"));
       e1.sendKeys("kalyanimshende@gmail.com");
       WebElement e2=driver.findElement(By.id("pass"));
      e2. sendKeys("kalyani@90");

      Date d1=new Date();
      System.out.println(d1.getTime());
      
      Date d2 =new Date(d1.getTime()+(60*60*1000*24*5));
     System.out.println(d2);
     String f1=d2.toString();
     String year=f1.substring(f1.length()-4);
     System.out.println(year);
     String month=f1.substring(4,7);
     String date=f1.substring(8,10);
     String day=f1.substring(0,3);
     String hours=f1.substring(11,13);
     String min=f1.substring(14,16);   
     String sec=f1.substring(17,19);
     
       String f2=date.concat(month).concat(year);
       System.out.println(f2);
       String f3=date.concat("").concat(day).concat("").concat(f2).concat("").concat(hours).concat("").concat(min).concat("").concat(sec);
     System.out.println(f3);
       TakesScreenshot ts=driver;
      File Source= ts.getScreenshotAs(OutputType.FILE);
      File Destination= new File("E:\\Kalyani\\GrowTechMind\\Screenshots\\"+new Assignments_137().getClass()+f3+".png");
      FileHandler.copy(Source, Destination);

	}

}
