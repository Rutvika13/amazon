package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_111 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       WebElement e1= driver.findElement(By.id("email"));
       e1.sendKeys("kalyanimshende@gmail.com");
       WebElement e2=driver.findElement(By.id("pass"));
      e2. sendKeys("kalyani@90");
      WebElement e3=driver.findElement(By.name("login"));
       e3.click();

      
	}
}
