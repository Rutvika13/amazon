package TestNgprogram;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends amazon
{
	@Test
	public void test1()
	{
		System.out.println("Test case 1");
		Reporter.log("Excution test case 1");
	}

}
