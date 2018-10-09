package com.capgemini.Stream.parallelStream;

import java.util.*;
import java.util.stream.Stream;

public class ClientTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student1>list =new ArrayList<>();
list.add(new Student1("aa",20));
list.add(new Student1("bb",21));
Stream<Student1> parallelStream=list.parallelStream();
System.out.println("Students data send for processing");
parallelStream.forEach(s->doProcess(s));
	}

	private static void doProcess(Student1 s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

}
