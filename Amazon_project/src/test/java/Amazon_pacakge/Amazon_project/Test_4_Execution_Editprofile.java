package Amazon_pacakge.Amazon_project;



import org.testng.annotations.Test;

public class Test_4_Execution_Editprofile extends Basepage
{
	
@Test(retryAnalyzer=IRetrylogic.class)

public void editprofile() throws InterruptedException
{
	
	Caseno_4_Editprofile c2=new Caseno_4_Editprofile(driver);
	c2.youract();
	Thread.sleep(1000);
	c2.loginandsecbtn();
	c2.addads();
	
	Homepage c1= new Homepage(driver);
	c1.username();
	c1.continebtn();
	c1.passw();
	Thread.sleep(1000);
	c1.finalsigning();
	c2.editbtn();
	c2.changenamebtn();
	c2.savebtn();
	
	
	
	
	
	
}
}
