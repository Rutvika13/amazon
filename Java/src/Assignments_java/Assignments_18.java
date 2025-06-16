package Assignments_java;

public class Assignments_18 
{
	void Assignments_18(int a)
	 {
		 System.out.println("Non static Constructor with integer parameter");
	 }
	static void Assignments_18(double d)
	 {
		 System.out.println("Static Constructor with double parameter");
	 }
	static void Assignments_18(String s)
	 {
		 System.out.println("Static Constructor with string parameter");
	 }
	void Assignments_18()
	 {
		 System.out.println("Non static Constructor with default parameter");
	 }
	void Assignments_18(boolean b)
	 {
		 System.out.println("Non static Constructor with boolean parameter");
	 }
	
	
	
	
	public static void main(String[] args) 
	{
		Assignments_18(2.3);
		Assignments_18("kalyani");
		Assignments_18 a= new Assignments_18();
		a.Assignments_18();
		a.Assignments_18(false);
		a.Assignments_18(19);

	}

}
