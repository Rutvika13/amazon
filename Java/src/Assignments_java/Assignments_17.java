package Assignments_java;

public class Assignments_17 
{
	 void Assignments_17(int a)
	 {
		 System.out.println("Constructor with integer parameter");
	 }
	 void Assignments_17()
	 {
		 System.out.println("Constructor with no parameter");
	 }
	
	 void Assignments_17(String s)
	 {
		 System.out.println("Constructor with String parameter");
	 }
	
	public static void main(String[] args)
	{
		Assignments_17 a= new Assignments_17();
		a.Assignments_17(12);
		a.Assignments_17("kalyani");
		a.Assignments_17();
	}

}
