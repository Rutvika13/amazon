package Assignments_java;

public class Assignments_75 
{

	public static void main(String[] args) 
	{
		
		int sum =0;
		int []input=new int[4];
		input[0]=2;
		input[1]=4;
		input[2]=6;
		input[3]=8;
		
		for(int a=0;a<4;a++)
		{
			sum=sum+input[a];
		}
		System.out.println("sum--->"+sum);
		int avg=sum/input.length;
		System.out.println("Avarage--->"+avg);
	}

}
