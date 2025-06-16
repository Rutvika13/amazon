package Assignments_java;

import java.util.Scanner;

public class Assignments_27 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of B");
		double b=s1.nextInt();
		System.out.println("Please enter the value of H");
		double h=s1.nextInt();
		double output= 0.5*b*h;
		System.out.println(output);
		s1.close();
	}
	

}
