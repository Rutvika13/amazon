package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_118 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://grotechminds.com/registration/");
        driver.manage().window().maximize();	
        WebElement firstname=driver.findElement(By.xpath("(//input)[22]"));
        firstname.sendKeys("kalyani");
       
	}


}
