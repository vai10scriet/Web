package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String args[])
	{
		
		String[] str= {"Rohit","Ram","Rohit","Rahul","Rahul","Ram","Sita"};
		
		
		for(int i=0;i<str.length;i++)
		{
			
   			for(int j=i+1;j<str.length;j++)
   			{
   				
   				if(str[i]==str[j])
   				{
   					
   					
   					System.out.println("Duplicate string is "+str[i]);
   					
   				}
   				
   				
   			}
   				
			
			
		}
		
		System.out.println("HashSet duplicate Elements");
		
		Set<String> set=new HashSet<String>();
		
		for(String st:str)
		{
			
			if(set.add(st)==false)
			{
				
				System.out.println("Duplicate Element is "+st);
				
			}
			
		}
		
		
		System.out.println("HashMap duplicate Elements");
		
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String st:str)
		{
			if(map.get(st)==null)
			{
				map.put(st,1);
				
			}
			
			else
			{
				
				map.put(st,map.get(st)+1);
			}
			
			
		}
		
		
		Set<Entry<String, Integer>> entryset=map.entrySet();
		
		for(Entry<String, Integer> entry:entryset)
		{
			
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate elements are "+entry.getKey());
				
			}
			
		}
		
	}

}
