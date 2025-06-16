package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_1_newuser 
{
	@Test
	public void newus()
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in ");
        driver.manage().window().maximize();
        
        WebElement accountandlist=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist);
		a1.perform();
		
		WebElement newus=	driver.findElement(By.xpath("//a[@class='nav-a']"));
		newus.click();
		
		WebElement continuebt=	driver.findElement(By.xpath("//input[@class='a-button-input']"));
		
		
		Assert.assertEquals(continuebt.isDisplayed(), true);
		
	}

}
