package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignments_133 
{


	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
	      driver.get("https://www.amazon.com");
	      driver.manage().window().maximize();
	      WebElement e1=driver.findElement(By.linkText("About Amazon"));
	Point p1= e1.getLocation ();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	
	   JavascriptExecutor js = driver;
	   js.executeScript("window.scrollBy(0,2000)");
	}
}
