package Assignments_java;

public class Assignments_13 
{
	void add()
	{
		System.out.println("Non static method");
	}
	static void sub()
	{
		System.out.println("static method");
	}
	
	
	
	public static void main(String[] args) 
	{
		sub();
		Assignments_13 a= new Assignments_13();
		a.add();

	}

}
