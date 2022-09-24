package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P5 {
	
	public static void main(String args[])
	{
		
		 //Find occurrences of characters in a string	
		String str="007 india";
		CharCount(str);
		
	}
	
	
	
	public static void CharCount(String str)
	{
		
		if(str==null)
		{
			
			System.out.println("String is null");
		}
		
		else if(str.isEmpty())
		{
			System.out.println("String is Empty");
			
		}
		
		char[] ch=str.toCharArray();
		Map<Character,Integer> map =new HashMap<Character,Integer>();
		
		for(Character i:ch)
		{
			if(map.containsKey(i))
			{
				
				map.put(i,map.get(i)+1);
			}
			
			else
				
			{
				
				map.put(i, 1);
			}
			
		}
		
		Set<Entry<Character, Integer>> entryset=map.entrySet();
		
		for(Entry<Character, Integer> entry:entryset)
		{
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	

}
