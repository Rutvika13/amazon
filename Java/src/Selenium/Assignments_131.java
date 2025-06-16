package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_131 
{
	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.flipkart.com");
      driver.manage().window().maximize();
     WebElement e1= driver.findElement(By.xpath("//input[@type='text']"));
     Dimension d=e1.getSize();
    int w= d.getWidth();
     int h=d.getHeight();
      System.out.println(h);
      System.out.println(w);


	}


}
