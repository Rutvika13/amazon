package Array;

import java.util.Arrays;

public class revers_array 
{
	public static void main(String[] args) 
	{
		int [] i=new int[4];
		i[0]=12;
		i[1]=13;
		i[2]=14;
		i[3]=15;
		
		int [] o=new int[i.length];
		
		for(int a=3,b=0;a>=0;a--,b++)
		{
			o[b]=i[a];
		}
		System.out.println("input---->"+Arrays.toString(i));
		System.out.println("output---->"+Arrays.toString(o));
		
	}


}
