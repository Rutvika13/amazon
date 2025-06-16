package Amazon_pacakge.Amazon_project;



import org.testng.annotations.Test;

public class Test_3_Execution extends Basepage
{

	@Test(retryAnalyzer=IRetrylogic.class)
	public void wrongdetails() throws InterruptedException
	{
		Homepage i1= new Homepage(driver);
		i1.login();
		
		invalid_detaile_3 invaliddetails= new invalid_detaile_3(driver);
		invaliddetails.username();
		i1.continebtn();
		Thread.sleep(1000);
		invaliddetails.passw();
		Thread.sleep(1000);
		i1.finalsigning();
		
	}
}
