package Classproject.classtestproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginAddtocartlogout 
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
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[1]")
	WebElement addtocart;


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

	public void passw() {
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
	public void addtocartbtn(WebDriver driver) 
	{
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		
		Iterator<String>link= ids.iterator();
		String PI=link.next();
		String CI=link.next();
		System.out.println(PI);
		System.out.println(CI);
		
		driver.switchTo().window(CI);
		addtocart.click();
		
	}
	

	public LoginAddtocartlogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	}




