package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_119 
{
	public static void main(String[] args) 
	{
//			ChromeDriver driver = new ChromeDriver();
//      driver.get("https://www.flipkart.com");
//      driver.manage().window().maximize();
//        WebElement e1=driver.findElement(By.xpath("(//input)[1]"));
//        e1.sendKeys("Bisleri"+Keys.ENTER);
        
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();	
        WebElement e1=driver.findElement(By.xpath("(//input)[5]"));
        e1.sendKeys("Bisleri"+Keys.ENTER);
        
	}

}
