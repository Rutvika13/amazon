package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_124 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.get("https://grotechminds.com/registration/");
	      driver.manage().window().maximize();
	    WebElement e1=  driver.findElement(By.xpath("//input[@id='First Name']"));
	     boolean b1= e1.isDisplayed();
          System.out.println(b1);
          if(b1==true)
          {
        	  e1.sendKeys("kalyani");
          }
          
          boolean b2= e1.isEnabled();
          System.out.println(b2);
          boolean b3= e1.isSelected();
          System.out.println(b3);
	}

}



