package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_126 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com");
	      driver.manage().window().maximize();
	      driver.navigate().back();
	      Thread.sleep(2000);
	      driver.navigate().forward();
	      Thread.sleep(2000);
	      driver.navigate().refresh();
	      Thread.sleep(2000);
	      driver.navigate().to("https://www.amazon.in");
	      Thread.sleep(2000);
	      driver.navigate().back();

	}


}
