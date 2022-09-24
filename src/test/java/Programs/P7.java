package Programs;

public class P7 {
	
	public static void main(String args[])
	{
		
		String str="#GeeKs01fOr@gEEks07";
		
		int upper=0,lower=0,number=0,special=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			Character ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			
			else if(ch>='a' && ch<='z')
			{
				
				lower++;
			}
			
			else if(ch>='0' && ch<='9')
			{
				
				number++;
			}
			
			else special++;
			
			
			
			
		}
		
		System.out.println("Number of upper case"+upper);
		System.out.println("Number of lower case"+lower);
		System.out.println("Number of number case"+number);
		System.out.println("Number of number case"+special);
		
		
		
	}

}
