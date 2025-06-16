package Assignments_java;

public class Assignments_16 
{
	 void show(int a)
	 {
		System.out.println("Non static Interger");
		 
	 }
	 void show(double d)
	 {
		System.out.println("Non static Double");
		 
	 }
	 
	 static void show(String s)
	 {
		 System.out.println("static String");
		 
	 }
	 
	 static void show(boolean b)
	 {
		 System.out.println("static Boolean");
		 
	 }
	 
		
		public static void main(String[] args) 
		{
			show("kalyani");
			show(true);
			Assignments_16 a= new Assignments_16();
			a.show(12.5);
			a.show(19);

		}
}

