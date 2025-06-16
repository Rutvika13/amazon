package Classproject.classtestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addaddress 
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
	
	@FindBy(xpath = "(//span[@class='nav-text'])[6]")
	WebElement youraccount;
	
	@FindBy(xpath = "(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[4]")
	WebElement youraddress;
	
	@FindBy(xpath = "//div[@class='a-box-inner a-padding-extra-large']")
	WebElement editaddress;
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
	
	public void act() {
		youraccount.click();
	}
	public void add() {
		youraddress.click();
	}
	
	public void editadd() {
		editaddress.click();
	}
	
	public Addaddress(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
