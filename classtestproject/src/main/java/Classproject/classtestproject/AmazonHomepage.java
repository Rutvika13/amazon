package Classproject.classtestproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage 
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

public void signin()
{
	signinbtn.click();
}
public void username()
{
	usernametext.sendKeys("7066328484");
}
public void continuetext()
{
	continuebtn.click();
}
public void pwd() throws InterruptedException
{Thread.sleep(1000);
	password.sendKeys("kalyani@90");
}

public void finalsignin()
{
	finalsubmit.click();
}

public AmazonHomepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}


