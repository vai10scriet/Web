package practice;

import java.util.Arrays;

public class P6 {
	
	public static void main(String args[])
	{
		
		
	System.out.println(getData("Listfen","Silent "));	
		
		
	}
	
	
	public static boolean getData(String str1,String str2)

	{
		  str1=str1.replaceAll("\\s", "");
		  str2=str2.replaceAll("\\s", "");
     		
		  if(str1.length()!=str2.length())
		  {
			  
			 return false;
		  }
		  
		  else
		 {
			  
			  char[] str3=str1.toLowerCase().toCharArray();
			  char[] str4=str2.toLowerCase().toCharArray();
	           Arrays.sort(str3);
	           Arrays.sort(str4);
		  
          	   return Arrays.equals(str3, str4);	
		  
		 }
		
	}
	

}
