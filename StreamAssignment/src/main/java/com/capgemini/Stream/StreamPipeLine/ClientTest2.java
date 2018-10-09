package com.capgemini.Stream.StreamPipeLine;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class ClientTest2 {
	public static void main(String args[])
	{
		Stream<String> onceModifiedStream=Stream.of("abcd","bbcd","cbcd").skip(1);
		onceModifiedStream.forEach(System.out::println);
		System.out.println("==========");
		Stream<String> stream=Stream.of("abcd","bbcd","cbcd");
		Stream<String> modified=stream.skip(1).map(element->element.substring(0,3));
		modified.forEach(System.out::println);
		System.out.println("==========");
		List<String> list=Arrays.asList("abc1","abc2","abc3");
		long size=list.stream().skip(1).map(element->element.substring(0,3)).sorted().count();
		System.out.println(size);
		
	} 

}
