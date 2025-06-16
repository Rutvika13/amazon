package TestNgprogram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Brokenlink 
{
	@Test
	public void googlepage() throws IOException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		for(int a=0; a<=link.size();a++)
		{
			 WebElement link1=link.get(a);
			 String url=link1.getDomAttribute("href");
			 String text=link1.getText();
			 System.out.println(url);
				System.out.println(text);
				verifythelink(url);
		}
		}
		static void verifythelink(String url) throws IOException
		{
			URL u1=new URL(url);
			HttpURLConnection c1=(HttpURLConnection) u1.openConnection();
			if(c1.getResponseCode()==200)
			{
				System.out.println("Link is valid"+c1.getResponseMessage());
			}
			else
			{
				System.out.println("Link is not valid"+c1.getResponseMessage());
			}
		}
		
	}

