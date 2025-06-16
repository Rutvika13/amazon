package Classproject.classtestproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoWishlist 
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
	WebElement firstproduct;
	
	@FindBy(xpath="//input[@name='submit.add-to-registry.wishlist']")
	WebElement wishlist;
	
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
	
	public void firstproduct() {
		firstproduct.click();
	}
	public void addtowishlist(WebDriver driver) 
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
	public AddtoWishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
}
