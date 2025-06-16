package Array;

import java.util.Arrays;

public class Count_array_string 
{
	static int alpha=0;
	static int num=0;
	static int space=0;
	static int sp=0;

	public static void main(String[] args) 
	{
		String s1="kalynai @ 1990";
		char [] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for (int a=0;a<=s1.length()-1;a++)
		{
			boolean b1=Character.isAlphabetic(c1[a]);
			boolean b2=Character.isDigit(c1[a]);
			boolean b3=Character.isWhitespace(c1[a]);
			
			if(b1==true)
			{
				alpha++;
			}
			if(b2==true)
			{
				num++;
			}
			if(b3==true)
			{
				space++;
			}
			
		
		
	}
		System.out.println("alphabetic--->"+alpha);
		System.out.println("number--->"+num);
		System.out.println("space--->"+space);
		sp=s1.length()-(alpha+num+space);		
		System.out.println("special charater--->"+sp);
}

}
