package Classproject.classtestproject;

import org.testng.annotations.Test;

public class Testcase_3_AddtoWishlist extends BaseClassTest1
{
	@Test
	public void addtowishlist1() throws InterruptedException
	{
		AddtoWishlist wishlist= new AddtoWishlist(driver);
		wishlist.login();
		wishlist.username();
		wishlist.continebtn();
		wishlist.passw();
		wishlist.finalsigning();
		wishlist.search();
		wishlist.firstproduct();
		wishlist.addtowishlist(driver);
	}

}
