package com.makemytrip.Web;

public class P1 {
	
	
	public static void main(String args[])
	{
		
		String s="Selenium";
		/*
		 * String rev=""; for(int i=s.length()-1;i>=0;i--) { rev=rev+s.charAt(i);
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 */
	
	StringBuffer sf= new StringBuffer(s);
    StringBuffer str=sf.reverse();
    
    System.out.println(str);
	
	}

}
