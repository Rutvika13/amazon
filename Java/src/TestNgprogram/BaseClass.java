package TestNgprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass {
	WebDriver driver;

	@BeforeMethod
	@Parameters("Browser")
	public void loginpage() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		WebElement accountandlist=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist);
		a1.perform();
//		
//		WebElement signin=	driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
//		signin.click();
//		
//		WebElement un=	driver.findElement(By.xpath("//input[@name='email']"));
//		un.sendKeys("7066328484");
//		
//		WebElement continuebtn=	driver.findElement(By.xpath("//span[@id='continue']"));
//		continuebtn.click();
//		Thread.sleep(2000);
//		
//		WebElement pwd=	driver.findElement(By.xpath("//input[@type='password']"));
//		pwd.sendKeys("kalyani@90");
//		
//		WebElement submit=	driver.findElement(By.id("signInSubmit"));
//		submit.click();
//		
		Reporter.log("Entering the vaild details");

	}
	
	@AfterMethod
	public void logout()

	{
		WebElement accountandlist1=	driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist1);
		a1.perform();
		
		WebElement signout=	driver.findElement(By.xpath("(//span[@class='nav-text'])[7]"));
		signout.click();
		Reporter.log("Successful logout");
	}

}
