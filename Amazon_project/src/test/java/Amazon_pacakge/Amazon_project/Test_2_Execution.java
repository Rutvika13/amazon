package Amazon_pacakge.Amazon_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_2_Execution extends Basepage
{
	@DataProvider(name="data")
	
	public Object[][] Datafetching() throws EncryptedDocumentException, IOException
	{
		Object[][] ob1= new Object[1][2];
		
			FileInputStream s1= new  FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Amazon_project\\Datasheet.xlsx");
		Workbook wb=WorkbookFactory.create(s1);
			String username=NumberToTextConverter.toText(wb.getSheet("data").getRow(0).getCell(0).getNumericCellValue());
			String password=wb.getSheet("data").getRow(0).getCell(1).getStringCellValue();
			ob1[0][0]=username;
			ob1[0][1]=password;
			return ob1;
	}
	
	@Test(dataProvider="data")
	public void sucsessfulloginwithrightdetails(String username,String password) throws InterruptedException
	{
		
		Homepage newuser= new Homepage(driver);
		newuser.login();	
		Thread.sleep(1000);
		newuser.usernameforlogin(username);
		newuser.continebtn();
		Thread.sleep(1000);
		newuser.passwordforlogin(password);;
		newuser.finalsigning();
		//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			
	}

}
