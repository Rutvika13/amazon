package Assignments_java;

import java.util.Scanner;

public class Assignments_28 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of A");
		double a=s1.nextInt();
		System.out.println("Please enter the value of B");
		double b=s1.nextInt();
		System.out.println("Please enter the value of C");
		double c=s1.nextInt();
		double output= a+b+c;
		System.out.println(output);
		s1.close();

	}

}
