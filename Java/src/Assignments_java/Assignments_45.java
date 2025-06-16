package Assignments_java;


class amazon
{
	void login()
	{
		System.out.println("Log -in to amazon" );
	}
}

public class Assignments_45 extends amazon
{
	
	void login()
	{
		System.out.println("Log -in Assignments45" );
	}
	public static void main(String[] args) 
	{
		Assignments_45 as=new Assignments_45();
		as.login();

	}
}
