package com.capgemini.Stream.StreamAssignment;

import java.util.Arrays;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[]{"aa","bb","cc"};
Stream<String> stream=Arrays.stream(arr);
stream.forEach(System.out::println);
//another way to create a stream
System.out.println("==================");
System.out.println("Another way to crate Stream is");
Stream<String> of=Stream.of("A","B","C","D");
of.forEach(System.out::println);
	}

}
