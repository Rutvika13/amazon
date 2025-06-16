package Array;

import java.util.Arrays;

public class Array_Equals 
{

	public static void main(String[] args) 
	{
		int [] a1=new int[4];
		a1[0]=20;
		a1[1]=30;
		a1[2]=40;
		a1[3]=50;
		
		int [] a2=new int[4];
		a2[0]=20;
		a2[1]=30;
		a2[2]=50;
		a2[3]=50;
		
	boolean b1 =Arrays.equals(a1, a2);
		
		if (b1==true)
		{
			System.out.println("equals");
		}		
		else
		{
			System.out.println("NOt equals");
		}		
		
		
		
		
	}

}
