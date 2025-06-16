package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments_113 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement e1= driver.findElement(By.linkText("Login"));
        e1.click();
        WebElement email= driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
       email.sendKeys("kalyanimshende@gmail.com");
        WebElement e3= driver.findElement(By.className("QqFHMw twnTnD _7Pd1Fp"));
        e3.click();

}
}