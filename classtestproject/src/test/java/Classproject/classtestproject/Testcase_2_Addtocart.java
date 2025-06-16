package Classproject.classtestproject;

import org.testng.annotations.Test;

public class Testcase_2_Addtocart extends BaseClassTest1
{
@Test
public void addtocart() throws InterruptedException
{
	
	LoginAddtocartlogout addtocart= new LoginAddtocartlogout(driver);
	addtocart.login();
	addtocart.username();
	addtocart.continebtn();
	Thread.sleep(1000);
	addtocart.passw();
	addtocart.finalsigning();
	addtocart.search();
	addtocart.firstproduct();
	addtocart.addtocartbtn(driver);
	
	
	
}
}