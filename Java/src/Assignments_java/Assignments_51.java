package Assignments_java;



interface meshoo
{
	void login();
	void logout();
}



public class Assignments_51 implements meshoo
{

	public static void main(String[] args) 
	{
		Assignments_51 as =new Assignments_51();
		as.login();
		as.logout();
	}

	@Override
	public void login() 
	{
		System.out.println("Log-in method");
	}

	@Override
	public void logout() 
	{
		
		System.out.println("Log-out method");
	}
	

}
