package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_129 
{
	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      
     List<WebElement> link= driver.findElements(By.tagName("a"));
     for(int a=0;a<link.size();a++)
     {
     WebElement link1=link.get(a);
     String url=link1.getDomAttribute("href");
    String text=link1.getText();
     System.out.println(url);
     System.out.println(text);
      }
	}
}
