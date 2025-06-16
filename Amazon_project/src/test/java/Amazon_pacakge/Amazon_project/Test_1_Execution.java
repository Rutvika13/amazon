package Amazon_pacakge.Amazon_project;

import java.io.IOException;


import org.testng.annotations.Test;

public class Test_1_Execution extends Basepage
{

	@Test()
	public void loginsuccesful() throws InterruptedException, IOException
	{
		Homepage h1= new Homepage(driver);
		h1.login();
		h1.username();
		h1.continebtn();
		Thread.sleep(1000);
		h1.passw();
		h1.finalsigning();
		
		
	}
}
