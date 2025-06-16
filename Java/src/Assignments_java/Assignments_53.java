package Assignments_java;


interface one1
{
	void method1();
	void method2();
}


interface two2
{
	void method3();
	void method4();
}


interface three3
{
	void method5();
	void method6();
}


interface four4
{
	void method7();
	void method8();
}
public class Assignments_53 implements one1,two2,three3,four4
{
	public static void main(String[] args) 
	{
		Assignments_53 as= new Assignments_53();

		as.method1();
		as.method2();
		as.method3();
		as.method4();
		as.method5();
		as.method6();
		as.method7();
		as.method8();
	}

	@Override
	public void method1() 
	{
		System.out.println("Method -1");
		
	}

	@Override
	public void method2() 
	{
		System.out.println("Method -2");
		
	}

	@Override
	public void method7() 
	{
		
		System.out.println("Method -7");
	}

	@Override
	public void method8() 
	{
		
		System.out.println("Method -8");
	}

	@Override
	public void method5() 
	{
		System.out.println("Method -5");
		
	}

	@Override
	public void method6() 
	{
		System.out.println("Method -6");
		
	}

	@Override
	public void method3() 
	{
		System.out.println("Method -3");
		
	}

	@Override
	public void method4() 
	{
		System.out.println("Method -4");
		
	}
}
