package Assignments_java;

class Flipkart
{
	void login()
	{
		System.out.println("Log -in to flipkart" );
	}
}

 

	class crom extends Flipkart
	{
		void login()
		{
			super.login();
			System.out.println("Log -in to crom" );
		}
	}



public class Assignments_46 extends crom
{
	
	void login()
	{
		super.login();
		System.out.println("Log -in Assignments46" );
	}

public static void main(String[] args) 
{
	Assignments_46 as=new Assignments_46();
	as.login();

}

}
