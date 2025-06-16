package Assignments_java;

public class Assignments_14 
{

	void add(int a)
	{
		System.out.println("Integer method");
	}
	
	void sub(String s)
	{
		System.out.println("String method");
	}
	
	void mul(double d)
	{
		System.out.println("double method");
	}
	
	void div(boolean b)
	{
		System.out.println("boolean method");
	}

	public static void main(String[] args)
	{
		Assignments_14 a=new Assignments_14();
		a.add(12);
		a.sub("kalyani");
		a.mul(2.35);
		a.div(true);
	}

}
