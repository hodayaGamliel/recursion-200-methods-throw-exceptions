package com.example;


public class Fib 
{
	public static void main(String[] args) throws Exception
	{
		int x = 9 ;
		int n = x + 1 ;
		System.out.println(fib(n));
	}
	
	public static int fib(int n)
	{
	if((n==1)||(n==2))
	return n-1;
	return fib(n-1)+fib(n-2);
	}
}
