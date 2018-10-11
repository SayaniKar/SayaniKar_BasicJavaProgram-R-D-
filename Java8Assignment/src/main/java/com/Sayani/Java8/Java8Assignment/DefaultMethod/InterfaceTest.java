package com.Sayani.Java8.Java8Assignment.DefaultMethod;

import com.Sayani.Java8.Java8Assignment.MyInterface;

public class InterfaceTest implements MyInterface1,MyInterface2 {
	@Override
	public void display()
	{
		MyInterface1.super.display();
		MyInterface2.super.display();
		
	}
	public static void main(String[] args)
	{
		InterfaceTest test=new InterfaceTest();
		test.display();
	}
	
}
