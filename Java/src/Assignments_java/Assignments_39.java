package Assignments_java;

public class Assignments_39 extends Assignments_38
{

	void add1()
	{
		System.out.println("Ass 39 non static addition method");
	}
	static void sub1()
	{
		System.out.println("Ass 39 static subtration method");
	}

public static void main(String[] args) 
{
	sub();
	Assignments_39 c=new Assignments_39();
	c.add();
	sub1();
	c.add1();
}

}
