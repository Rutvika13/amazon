package Assignments_java;

public class Assignments_34 
{

	int a=10;
	int b=20;
	static int c=40;
	static int d=5;
	
	void nonstatic()
	{
		System.out.println(a+b);
	}
	
	static void addstatic()
	{
		System.out.println(c+d);
	}

	public static void main(String[] args)
	{
		System.out.println(c);
		System.out.println(d);
		addstatic();
		Assignments_34 a=new Assignments_34();
		a.nonstatic();
	}

}
