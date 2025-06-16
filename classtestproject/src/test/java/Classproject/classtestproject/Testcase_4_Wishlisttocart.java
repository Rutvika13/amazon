package Classproject.classtestproject;

import org.testng.annotations.Test;

public class Testcase_4_Wishlisttocart extends BaseClassTest1
{
@Test
public void addwishlisttocart() throws InterruptedException
{
	Wishlisttocart wishtocart= new Wishlisttocart(driver);
	wishtocart.login();
	wishtocart.username();
	wishtocart.continebtn();
	wishtocart.passw();
	wishtocart.finalsigning();
	wishtocart.search();
	wishtocart.firstproduct();
	wishtocart.wishlistbtn(driver);
	wishtocart.frame(driver);
	//wishtocart.viewcart();

}
}
