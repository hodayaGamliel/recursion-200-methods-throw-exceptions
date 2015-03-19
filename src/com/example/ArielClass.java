package com.example;

public class ArielClass 
{
	public static void main(String[] args) 
	{
	System.out.println(recursionMethod(300));
	}
	
	public static int recursionMethod(int n) 
	{
		if (n == 1) 
		{
			try
			{
				int x = 5 / 0;
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			return n;		
		}
		else 
		{
			System.out.println(n);
			n = recursionMethod(n-1);
			return n ;  
		}
	}
}
