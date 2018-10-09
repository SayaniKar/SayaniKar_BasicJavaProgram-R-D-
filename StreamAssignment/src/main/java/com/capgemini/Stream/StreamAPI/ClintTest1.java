package com.capgemini.Stream.StreamAPI;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClintTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stream<String> build=Stream.<String>builder().add("aa").add("bb").
		add("cc").build();
	build.forEach(System.out::println);
	System.out.println("=========");
	Stream<String> limit=Stream.generate(()->"Hello").limit(10);
	limit.forEach(System.out::println);
	System.out.println("=========");
	IntStream range=IntStream.range(1,6);
	range.forEach(System.out::println);
	System.out.println("=========");
	IntStream range2=IntStream.rangeClosed(1,6);
	range2.forEach(System.out::println);
	System.out.println("=========");
	Random random=new Random();
	DoubleStream doubles=random.doubles(5);
	doubles.forEach(System.out::println);
//IntStream chars="abcd".chars();
	//will return the ASCII value of the characters
	}

}
