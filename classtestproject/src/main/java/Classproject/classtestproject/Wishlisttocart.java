package Classproject.classtestproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlisttocart 
{
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signinbtn;


	@FindBy(xpath="//input[@type='email']")
	WebElement usernametext;


	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continuebtn;


	@FindBy(xpath="//input[@type='password']")
	WebElement password;


	@FindBy(id="signInSubmit")
	WebElement finalsubmit;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchfiled;
	
	@FindBy(xpath="(//img[@class='s-image'])[1]")
	WebElement firstproduct1;
	
	@FindBy(xpath="//span[@id='huc-view-your-list-button']/span/a")
	WebElement wishlist;

	@FindBy(xpath="//div[@id='a-page']")
	WebElement framebox;
	
	@FindBy(linkText="View Your List")
	WebElement addocart;

	public void login()
	{
		signinbtn.click();

	}
	
	public void username() {
		usernametext.sendKeys("7066328484");
	}

	public void continebtn() {
		continuebtn.click();
	}

	public void passw() throws InterruptedException {
		Thread.sleep(1000);
		password.sendKeys("kalyani@90");
	}

	public void finalsigning() {
		finalsubmit.click();
	}
	
	public void search() {
		searchfiled.sendKeys("shoe"+Keys.ENTER);
	}
	
	public void firstproduct() 
	{
		firstproduct1.click();
	}
	public void wishlistbtn(WebDriver driver) 
	{
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String>link= ids.iterator();
		String PI=link.next();
		String CI=link.next();
		System.out.println(PI);
		System.out.println(CI);
		
		driver.switchTo().window(CI);
		wishlist.click();
		
	}
	public void frame(WebDriver driver) 
	{
		//driver.switchTo().frame(framebox);
		
		addocart.click();
	}
	
//	public void viewcart()
//	{
//		
//	}
	public Wishlisttocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
