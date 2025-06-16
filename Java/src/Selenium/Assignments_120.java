package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;


public class Assignments_120 
{

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
        driver.get("https://grotechminds.com/registration");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        e1.sendKeys("kalyani");
       e1.sendKeys(Keys.CONTROL+"a");
       Thread.sleep(2000);
       e1.sendKeys(Keys.CONTROL+"c");
       Thread.sleep(2000);
       
        WebElement e2=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        e2.sendKeys(Keys.CONTROL+"v");
	}
}
