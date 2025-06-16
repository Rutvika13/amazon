package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_110 
{
	public static void main(String[] args) 
	{
		 ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         driver.findElement(By.id("email")).sendKeys("kalyanimshende@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("kalyani@90");
    
	}

}
