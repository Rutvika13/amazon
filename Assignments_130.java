package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_130 
{

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.facebook.com");
	      driver.manage().window().maximize();
	      WebElement e1=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	     // e1.click();
	     String colour= e1.getCssValue("background-colour");
	      System.out.println(colour);
	}

}
