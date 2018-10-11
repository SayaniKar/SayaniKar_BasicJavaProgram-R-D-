package com.Sayani.Java8.Java8Assignment.LambdaExpressionDemo;


public class ClientTest 
{
	public static void main(String[] args)
	{
		MyInterface myInter=(String name)->System.out.println("Name is:"+name);
		myInter.display("Sayani");
		
		
	}

}
