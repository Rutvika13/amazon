package Assignments_java;

import java.util.Scanner;

public class Assignments_32 
{
	public static void main(String[] args) 
	{

		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of A");
		int a=s1.nextInt();
		System.out.println("Please enter the value of B");
		int b=s1.nextInt();
		int output= 2*(a+b);
		System.out.println(output);
		s1.close();

	}


}
