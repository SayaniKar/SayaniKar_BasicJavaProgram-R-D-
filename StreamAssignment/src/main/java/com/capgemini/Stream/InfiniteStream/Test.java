package com.capgemini.Stream.InfiniteStream;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Stream<Integer> iterate=Stream.iterate(0,i->i+2);
List<Integer> collect=iterate.limit(10).collect(Collectors.toList());
	collect.forEach(System.out::println);
	
	
	System.out.println("============");
	System.out.println("Test Infinite Stream");
Supplier<UUID> randomUUIDS	=UUID::randomUUID;
Stream<UUID> generate=Stream.generate(randomUUIDS);
List<UUID> collect1=generate.skip(10).limit(10).collect(Collectors.toList());

	collect1.forEach(System.out::println);
	System.out.println("============");
	System.out.println("How to print numbers from 0 to 9 using Stream");
	Stream<Integer> iterate1=Stream.iterate(0, i->i+1);
	iterate1.limit(10).forEach(System.out::println);
	}

}
