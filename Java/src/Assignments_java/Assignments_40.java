package Assignments_java;

public class Assignments_40 extends Assignments_39
{
	void add2()
	{
		System.out.println("Ass 40 non static addition method");
	}
	static void sub2()
	{
		System.out.println("Ass 40 static subtration method");
	}


	public static void main(String[] args) 
	{
		sub();
		Assignments_40 as= new Assignments_40();
		as.add();
		sub1();
		as.add1();
		sub2();
		as.add2();
		
	}
	
}
