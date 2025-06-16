package Amazon_pacakge.Amazon_project;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners1  implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("New test started"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test successful"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test failure"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped"+result.getName());
		
	}

	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("Test failure with timeout"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Test on start"+context.getName());
		
	}

	
	
}
