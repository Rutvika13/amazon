package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_117 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
        			e1.sendKeys("shoes"+Keys.ENTER);
         WebElement e2=driver.findElement(By.className("a-button-text")); 
         e2.click();
        	    
	}
}
