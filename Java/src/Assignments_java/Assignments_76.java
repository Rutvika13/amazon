package Assignments_java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_76 
{

	public static void main(String[] args) 
	{

		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the value array of index");
		String [] i1=new String[s1.nextInt()];
 
		for (int a=0;a<i1.length;a++)
		 {
			System.out.println("input--->"+a);
			 i1[a]=s1.next();
		 }
		System.out.println(Arrays.toString(i1));
		s1.close();
			 
		 }
}
