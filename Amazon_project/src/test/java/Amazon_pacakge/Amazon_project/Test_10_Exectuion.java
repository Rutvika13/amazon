package Amazon_pacakge.Amazon_project;

import org.testng.annotations.Test;

public class Test_10_Exectuion extends Basepage
{
	@Test
	public void addtocart() throws InterruptedException
	{
		Homepage c1=new Homepage(driver);
		c1.login();
		c1.username();
		c1.continebtn();
		Thread.sleep(1000);
		c1.passw();
		c1.finalsigning();
		
		Caseno_9_Addtocart c2= new Caseno_9_Addtocart(driver);
		c2.search();
		c2.firstproduct();
		
		
		Caseno_10_Addandremoveproduct c3= new Caseno_10_Addandremoveproduct(driver);
		c3.parenttochild(driver);
		c3.addquantitybtn();
		c3.addtocartbtn();
		c3.gotocartbtn();
		c3.delecttocartbtn();
		
		
		
	}
	

}

