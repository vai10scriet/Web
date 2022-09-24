package Programs;

public class P2_1 {
	
	public static void main(String args[])
	{
		//Palindrome String in java using Stringbuffer
		String str="radar";
		
		StringBuffer string =new StringBuffer(str);
		string.reverse();
	
		  String data =string.toString();
		if(str.toLowerCase().equals(data.toLowerCase()))
		{
			
			System.out.println("Given String is Palindrome");
			
		}
		
		else
		{
			
			System.out.println("Given String is not Palindrome");
		}
	}
	

}
