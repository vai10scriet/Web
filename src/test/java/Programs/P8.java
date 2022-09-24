package Programs;

import java.util.LinkedHashSet;

public class P8 {
	
	
	public static void main(String args[])
	{
		String str="india";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			
           set.add(str.charAt(i));
              
            }
		
		
		for(Character ch: set)
		{
			
			System.out.println(ch);
		}
	}

}
