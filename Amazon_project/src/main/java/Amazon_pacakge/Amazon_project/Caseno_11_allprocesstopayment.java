package Amazon_pacakge.Amazon_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Caseno_11_allprocesstopayment {
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchitem;
	

	@FindBy(xpath ="(//img[@class='s-image'])[1]")
	WebElement firstshoe;
	
	@FindBy(xpath ="//input[@id='buy-now-button']")
	WebElement bynow;
	
	@FindBy(xpath ="//span[@id='checkout-primary-continue-button-id']")
	WebElement deliveryadd;
	
	@FindBy(xpath ="//input[@id='pp-ed6cWL-129']")
	WebElement paymentmethod;
	
	@FindBy(xpath ="//span[@id='checkout-primary-continue-button-id']")
	WebElement usemethod;
	
	@FindBy(xpath ="//a[@class='a-link-normal expand-panel-button']")
	WebElement revieworder;
	
	
	public void search() {
		searchitem.sendKeys("shoe"+Keys.ENTER);
	}
	
	public void firstproduct() {
		firstshoe.click();
	}
	public void parenttochild(WebDriver driver) 
	{
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String>link= ids.iterator();
		String PI=link.next();
		String CI=link.next();
		System.out.println(PI);
		System.out.println(CI);
		driver.switchTo().window(CI);
	}
	
	
	public void bynowbtn() 
	{
		bynow.click();
	}
	public void delivaryaddbtn() 
	{
		deliveryadd.click();
	}
	
	public void paymentbtn() 
	{
		paymentmethod.click();
	}
	
	public void usepaymentbt() 
	{
		usemethod.click();
	}
	public void reviewbtn() 
	{
		revieworder.click();
	}
public Caseno_11_allprocesstopayment (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
	}


	
}




