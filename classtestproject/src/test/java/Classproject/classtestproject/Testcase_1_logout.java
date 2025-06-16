package Classproject.classtestproject;

import org.testng.annotations.Test;

public class Testcase_1_logout extends BaseClassTest1
{
@Test
public void loginandlogout() throws InterruptedException
{
	AmazonHomepage logout= new AmazonHomepage(driver);
	logout.signin();
	logout.username();
	logout.continuetext();
	logout.pwd();
	logout.finalsignin();
	
}	
}
