package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P1 {
	
	public static void main(String args[])
	{
		//String str="007 india india";
		String str=null;
		
		
		
		
		
		printDuplicateElements(str);
		
		
	}

	
	
	public static void printDuplicateElements(String str)
	{
		if(str==null)
		{
			System.out.println("String is null");
			return;
		}
		if(str.length()==1)
		{
			System.out.println("Single character string");
			
		}
		

		if(str.isEmpty())
		{
			System.out.println("String is empty");
			
		}
		
		
		char[] st=str.toCharArray();
	
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(Character ch: st)
		{
			if(map.containsKey(ch))
			{
				
				map.put(ch,map.get(ch)+1);
				
			}
			
			else
			{
				
				map.put(ch,1);
			}
		}
		
		Set<Entry<Character, Integer>> entryset=map.entrySet();
		for(Entry<Character, Integer> entry:entryset)
		{
			if(entry.getValue()>1)
			{
				
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
			
			
		}	
	}
}
