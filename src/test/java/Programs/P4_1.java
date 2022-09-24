package Programs;

public class P4_1 {
	
	static int n1=0,n2=1,n3;
	
	static void Fibonnaci(int count)
	{
		
	 if(count>0)
		{
			
			n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
			
			Fibonnaci(count-1);
			
		}
		
	}
	
	public static void main(String args[])
	{
		
		
		int count=10;
		System.out.print(n1+" "+n2);
		Fibonnaci(count-2);
		
		
		
	}
	
	
	

}
