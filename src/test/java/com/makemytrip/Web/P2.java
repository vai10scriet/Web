package com.makemytrip.Web;

public class P2 {

	static void validate(int age)
	{
		
		if(age>18)
		{
			System.out.println("This is valid age to vote");
			
		}
		
		else
			
		{
			
			try
			{
				throw new ArithmeticException("This is not valid age to  vote");
				
			}
			
			catch(ArithmeticException e)
			{
				
				System.out.println("Catching Aritmetic exception");
				
			}
			
			
			
		}
		
	}
	
	
	public static void main(String args[])
	{
		
		validate(10);
		
		System.out.println("Rest of code");
		
		
	}
	
	
	
}
