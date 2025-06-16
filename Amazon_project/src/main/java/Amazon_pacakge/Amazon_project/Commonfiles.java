package Amazon_pacakge.Amazon_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

public class Commonfiles 

{
	WebDriver driver;
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
	
public void Screenshots() throws IOException
{
    Date d1=new Date();
    System.out.println(d1.getTime());
    
    Date d2 =new Date(d1.getTime()+(60*60*1000*24*5));
   System.out.println(d2);
   String f1=d2.toString();
   String year=f1.substring(f1.length()-4);
   System.out.println(year);
   String month=f1.substring(4,7);
   String date=f1.substring(8,10);
   String day=f1.substring(0,3);
   String hours=f1.substring(11,13);
   String min=f1.substring(14,16);   
   String sec=f1.substring(17,19);
   
     String f2=date.concat(month).concat(year);
     System.out.println(f2);
     String f3=date.concat("").concat(day).concat("").concat(f2).concat("").concat(hours).concat("").concat(min).concat("").concat(sec);
   System.out.println(f3);
	TakesScreenshot ts= new EdgeDriver();
	File source=ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File("D:\\Kalyani\\GrowTechMind\\Screenshots"+new Commonfiles().getClass()+f3+".png");
	FileHandler.copy(source, Destination);
	
	
}
	
}
