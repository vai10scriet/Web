package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P2 {
	
	public static void main(String args[])
	{
		
		String str="java";
		printDuplicateElements( str);
		
	}
	
	
	public static void printDuplicateElements(String str)
	{
		
		if(str=="")
		{
			
			System.out.println("Blank value");
			return;
			
		}
		
		if(str==null)
		{
			
			System.out.println("String is null");
			return;
		}
		
		if(str.length()==1)
		{
			
			System.out.println("Single size String");
			return;
		}
		
		char[] ch=str.toCharArray();
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(Character st: ch)
		{
			if(map.containsKey(st))
			{
				
			  map.put(st, map.get(st)+1);
			}
			
			else
			
				
				{
					
					  map.put(st,1);
					}
		
			
		}
		
		Set<Entry<Character, Integer>> entryset=map.entrySet();
	
		for(Entry<Character, Integer> entry: entryset)
		{
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
				
			}
			
		}
		
		
		
	}

}
