package Assignments_java;




interface google
{
	void login();
	 void logout();
}


interface cromee extends google
{
	void login1();
	 void logout1();
}


public class Assignments_52 implements cromee
{
	public static void main(String[] args) 
	{
		Assignments_52	as=new Assignments_52();
		as.login();
		as.logout();
		as.login1();
		as.logout1();
		
	}

	@Override
	public void login() 
	{
		System.out.println("wel-come to google login");
		
	}

	@Override
	public void logout() 
	{
		
		System.out.println("wel-come to google logout");
	}

	@Override
	public void login1() 
	{
		System.out.println("wel-come to cromee login");
		
	}

	@Override
	public void logout1() 
	{
		System.out.println("wel-come to cromee logout");
	}


}
