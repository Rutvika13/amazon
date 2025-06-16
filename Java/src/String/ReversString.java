package String;

public class ReversString
{
	public static void main(String[] args) 
	{
		String s1="kalyani";
		String output="";
		
		
		for(int a=s1.length()-1;a>=0;a--)
		{
			output+=s1.charAt(a);
			
		}
		System.out.println("input-->"+s1);
		System.out.println("output-->"+output);
	}


}
