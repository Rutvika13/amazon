package Assignments_java;

public class Assignments_71 
{
	public static void main(String[] args) 
	{
		String s1= "radar";
        String output="";
        
        for(int a=s1.length()-1;a>=0;a--)
        {
        	output +=s1.charAt(a);
        }
       System.out.println("input--->"+s1);
       System.out.println("output--->"+output);
       if(s1.equals(output))
	{
	System.out.println("This String is palindrome");
	
	}
       else
    	   {System.out.println("This String is not palindrome");
    	   }
	}  
	

}
	