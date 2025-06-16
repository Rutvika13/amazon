package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignments_125 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://grotechminds.com/drag-and-drop");
	      driver.manage().window().maximize();
	      WebElement drag=driver.findElement(By.xpath("//img[@id='drag1']"));
	      WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
	      WebElement ob=driver.findElement(By.xpath("//div[@id='container']"));
	      Actions a1=new Actions(driver);
	      a1.dragAndDrop(drag, drop).perform();
	      a1.dragAndDrop(drop, ob).perform();
	}
}
