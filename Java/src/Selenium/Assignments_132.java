package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_132 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com");
	      driver.manage().window().maximize();
	      WebElement e1=driver.findElement(By.linkText("About Us"));
	Point p1= e1.getLocation ();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	     

	}
}
