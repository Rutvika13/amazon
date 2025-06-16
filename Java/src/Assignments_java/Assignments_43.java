package Assignments_java;

class rutvika
{
	rutvika(String s)
	{
		System.out.println("Rutvika constructor");
	}
	
}
class manesh extends rutvika
{
	manesh()
	{
		super("rutvika");
		System.out.println("manesh constructor");
	}
	
}
class kalyani extends manesh
{
	kalyani(int a)
	{
		System.out.println("kalyani constructor");
	}
	
}

public class Assignments_43 extends kalyani
{
	Assignments_43()
	{
		super(12);
		System.out.println("Assignments43 constructor");
	}
	

	public static void main(String[] args) 
	{

 new Assignments_43();

	
	
	}
	
}

