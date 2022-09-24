package Programs;

public class P2 {

	public static void main(String args[])
	{
		//Check Palindrome
		
		String str="Radar", rvStr="";
		
		int strLenght=str.length();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			Character ch=str.charAt(i);
			rvStr=rvStr+ch;
		}
		
		System.out.println("Reverse String is "+ rvStr);
		
		if(str.toLowerCase().equals(rvStr.toLowerCase()))
		{
			
			System.out.println("String is Palindrome");
		}
		
		
		else
		{
			
			System.out.println("String is not Palindrome");
			
		}
	}
	
}
