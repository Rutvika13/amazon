package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_5_product_Shoe
{
	@Test
	public void addshoe() throws InterruptedException
	{
	EdgeDriver driver = new EdgeDriver();
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
	WebElement search=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("shoes"+Keys.ENTER);
	
	WebElement addtocart=	driver.findElement(By.xpath("(//button[@class='a-button-text'])[1]"));

	Assert.assertEquals(addtocart.isEnabled(), true);
	
	
}
}
