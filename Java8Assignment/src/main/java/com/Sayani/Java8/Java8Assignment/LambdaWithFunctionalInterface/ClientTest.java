package com.Sayani.Java8.Java8Assignment.LambdaWithFunctionalInterface;

import com.Sayani.Java8.Java8Assignment.MyInterface;

/**
 * 
 * The First step is performed without Lambda Expression
 * @author Sayani
 *
 */
public class ClientTest {
	public static void main(String args[])
	{
		/*MyInterface1 myInterface1=new MyInterface1()
				{

					@Override
					public void display() {
						// TODO Auto-generated method stub
						System.out.println("Hello");
						
					}
			
				};
				myInterface1.display();
	}*/
		MyInterface1 myInterface1=()->System.out.println("Hello");
		myInterface1.display();
		MyInterface2 myinterface2=(String name,int age)->{
		System.out.println("Your name is:"+name);
		System.out.println("Your age is:"+age);
		
		
		
	};
	myinterface2.display2("Sayani",23);
	}
	

}
/**
 * 
 * This is done using Lambda Expression
 * 
 */
