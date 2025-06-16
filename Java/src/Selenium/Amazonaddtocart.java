package Selenium;


import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonaddtocart {

	public static void main(String[] args) throws InterruptedException 
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
		search.sendKeys("shoe"+Keys.ENTER);
		WebElement firstshoe=	driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		firstshoe.click();
		
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String>link= ids.iterator();
		String PI=link.next();
		String CI=link.next();
		System.out.println(PI);
		System.out.println(CI);
		
		driver.switchTo().window(CI);
		
		WebElement addtocart=	driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
	
		
		WebElement accountandlist1=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a1.moveToElement(accountandlist1);
		a1.perform();
		
		WebElement signout=	driver.findElement(By.xpath("(//span[@class='nav-text'])[7]"));
		signout.click();
		

	}

}
