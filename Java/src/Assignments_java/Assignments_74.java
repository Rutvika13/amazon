package Assignments_java;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_74
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the array of index");
		String []s2=new String[s1.nextInt()];
		
		for(int a=0;a<=s2.length-1;a++)
		{
			System.out.println("please enter the input--->"+a);
			s2[a]=s1.next();
		}
		
		System.out.println(Arrays.toString(s2));
s1.close();
	}

}
