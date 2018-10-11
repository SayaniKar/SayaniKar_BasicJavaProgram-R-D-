package com.Sayani.Java8.Java8Assignment;


import java.util.Collections;
import java.util.List;


public interface MyInterface {
	default List<Student> sortStudents(List<Student> studentList)
	{
		Collections.sort(studentList);
		return studentList;
	}
	public static void greet(String name)
	{
		System.out.print("Welcome:"+name);
	}
	public abstract Integer getMaximum(List<Integer>numberList);
}
