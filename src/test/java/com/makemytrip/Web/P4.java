package com.makemytrip.Web;

import java.io.IOException;

public class P4  {
	
	void n() throws IOException
	{
		
		throw new IOException("device error");
		
	}
	
	void m() throws IOException
	{
		
		n();
		System.out.println("After calling code");
		
	}

}
