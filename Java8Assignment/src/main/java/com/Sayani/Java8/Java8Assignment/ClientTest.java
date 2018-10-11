package com.Sayani.Java8.Java8Assignment;

import java.util.ArrayList;
import java.util.List;


public class ClientTest {

	public static void main(String[] args) {
		MyInterface myInterface=new MyClass();
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student("aa",22));
		studentList.add(new Student("bb", 23));
		studentList.add(new Student("cc", 19));
		studentList.add(new Student("dd", 18));
		studentList.add(new Student("ee", 21));
		
		List<Student> sortedStudent=myInterface.sortStudents(studentList);
		for(Student student:sortedStudent)
		{
			MyInterface.greet(student.getName()) ;
			System.out.println(" and age is:"+student.getAge());
			
		}
		
		List<Integer> numberList =new ArrayList<Integer>();
		numberList.add(234);
		numberList.add(9879);
		numberList.add(213);
		numberList.add(56);
		numberList.add(90);
		numberList.add(345);
		numberList.add(888);
		System.out.println("Maximum number is:"+myInterface.getMaximum(numberList));
		
	}

}