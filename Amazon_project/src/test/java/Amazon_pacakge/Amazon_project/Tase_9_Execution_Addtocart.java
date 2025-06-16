package Amazon_pacakge.Amazon_project;

import org.testng.annotations.Test;

public class Tase_9_Execution_Addtocart extends Basepage
{
	@Test
	public void addtocart() throws InterruptedException
	{
		Homepage addtocart= new Homepage(driver);
		addtocart.login();
		addtocart.username();
		addtocart.continebtn();
		addtocart.passw();
		Thread.sleep(1000);
		addtocart.finalsigning();
		
		Caseno_9_Addtocart c2= new Caseno_9_Addtocart(driver);
		c2.search();
		c2.firstproduct();
		c2.addtocartbtn(driver);
	}

}
