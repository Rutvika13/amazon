package Assignments_java;

import java.util.Arrays;

public class Assignments_82 
{
	public static void main(String[] args)
	{
		String s1="cat";
		String s2="act";
		
		
		if(s1.length()!=s2.length())
		{
		System.out.println("they are not anagram");
		}
		
		else
		
		{
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean b1=Arrays.equals(c1, c2);
		
		if(b1==true)
		{
			System.out.println("they are  anagram");	
		}
		else
		{
			System.out.println("they are not anagram");	
		}
		}
		
	}
}
