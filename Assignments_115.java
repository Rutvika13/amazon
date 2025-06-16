package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_115 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/ ");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.linkText("Gmail"));
       e1.click();
        
        
        

	}


}
