package Amazon_pacakge.Amazon_project;



import org.testng.annotations.Test;



public class Test_11_Execution_addpayment extends Basepage
{

@Test
public void addpayment() throws InterruptedException
{
	//https://grotechminds.com/explicit-wait-and-its-methods-in-selenium-webdriver/
	
	
	Homepage paymentselection= new Homepage(driver);
	paymentselection.login();
	paymentselection.username();
	paymentselection.continebtn();
	paymentselection.passw();
	paymentselection.finalsigning();
	
	Caseno_11_allprocesstopayment paymentselection1= new Caseno_11_allprocesstopayment(driver);
	paymentselection1.search();
	paymentselection1.firstproduct();
	paymentselection1.parenttochild(driver);
	paymentselection1.bynowbtn();
	paymentselection1.delivaryaddbtn();
	Thread.sleep(1000);
	paymentselection1.paymentbtn();


	
	
	
	
	
}
}
