package Array;

import java.util.Arrays;

public class copy_oneto_another 
{
	public static void main(String[] args)
	{
		int [] input=new int[4];
		input[0]=20;
		input[1]=30;
		input[2]=40;
		input[3]=50;
		
		int [] output= new int[input.length];
		
		for(int a=0;a<input.length;a++)
		{
			output[a]=input[a];
			
			
		}
		System.out.println("input---->"+Arrays.toString(input));
		System.out.println("output---->"+Arrays.toString(output));
		

}
	}
