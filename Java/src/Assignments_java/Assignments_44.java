package Assignments_java;

public class Assignments_44 
{

	Assignments_44()
	{
		System.out.println("Default constructor");
	}
	Assignments_44(int a)
	{
		this();
		System.out.println("Integer constructor");
	}
	Assignments_44(boolean b)
	{
		this(12);
		System.out.println("Boolean constructor");
	}
	Assignments_44(String s)
	{
		this(true);
		System.out.println("String constructor");
	}

	public static void main(String[] args) 
	{
		new Assignments_44("kalyani");

	}

}
