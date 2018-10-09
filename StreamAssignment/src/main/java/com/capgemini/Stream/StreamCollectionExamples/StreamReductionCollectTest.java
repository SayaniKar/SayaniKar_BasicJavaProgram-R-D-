package com.capgemini.Stream.StreamCollectionExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamReductionCollectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList=Arrays.asList(new Product(23,"potatoes"),
				new Product(14,"Orange"),
				new Product(15,"lemon"),
				new Product(16,"sugar"));
		Map<Boolean,List<Product>> collect=productList.stream().collect(Collectors.partitioningBy(p->p.getPrice()>15));
collect.forEach((k,v)->{
	System.out.println(k);
	System.out.println(v);
});
//Set<Product> collect2=productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),Collections::UnmodifiableSet));
	}

}
