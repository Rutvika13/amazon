package Assignments_java;

public class Assignments_41 extends Assignments_39
{
	void add3()
	{
		System.out.println("Ass 41 non static addition method");
	}
	static void sub3()
	{
		System.out.println("Ass 41 static subtration method");
	}

	public static void main(String[] args) 
	{
		sub3();
		Assignments_41 as= new Assignments_41();
		as.add3();
		sub1();
		as.add1();

	}


}
