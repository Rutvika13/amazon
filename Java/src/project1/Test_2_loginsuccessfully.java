package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_2_loginsuccessfully 
{

	@Test
	public void login() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in ");
		WebElement accountandlist=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist);
		a1.perform();
		
		WebElement signin=	driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		signin.click();
		
		WebElement un=	driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("7066328484");
		
		WebElement continuebtn=	driver.findElement(By.xpath("//span[@id='continue']"));
		continuebtn.click();
		Thread.sleep(2000);
		
		WebElement pwd=	driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("kalyani@90");
		WebElement submit=	driver.findElement(By.id("signInSubmit"));
		submit.click();
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
}
