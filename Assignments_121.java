package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments_121 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
      driver.get("https://grotechminds.com/dropdown");
      driver.manage().window().maximize();
//      WebElement e1=driver.findElement(By.xpath("(//select[@class='form-select Choice1 select2-hidden-accessible'])"));
//      Select s1=new Select(e1);
//      s1.selectByVisibleText("Demo2");
      
      WebElement e1=driver.findElement(By.xpath("//select[@class='form-select Choice2 select2-hidden-accessible']"));
      Select s1=new Select(e1);
      s1.selectByValue("practice15");
	}

}
