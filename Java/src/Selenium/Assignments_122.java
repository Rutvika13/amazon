package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Assignments_122 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.flipkart.com");
      driver.manage().window().maximize();
      
      WebElement e1=driver.findElement(By.xpath("//span[.='Login']"));
      
      Actions a= new Actions(driver);
      a.moveToElement(e1).perform();

      
	}


}
