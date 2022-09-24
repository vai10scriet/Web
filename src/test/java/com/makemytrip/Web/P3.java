package com.makemytrip.Web;

public class P3 {
	
	
	public static void main(String args[])
	{
		
		try {
			
			throw new UserDefined("This is user defined exception");
			
		}
		
		catch(UserDefined e)
		{
			
			 System.out.println("Caught the exception");  
			 e.printStackTrace();
			
		}
		
		
	}

}
