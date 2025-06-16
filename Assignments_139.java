package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_139 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
    driver.get("file:///E:/Kalyani/GrowTechMind/learningHTML1.html");
    driver.switchTo().alert().accept();
    driver.findElement(By.id("1")).sendKeys("kalyani");
    

	}


}
