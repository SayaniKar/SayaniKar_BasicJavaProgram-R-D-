package com.Sayani.Java8.Java8Assignment;


import java.util.Collections;
import java.util.List;


public class MyClass implements MyInterface{

	@Override
	public Integer getMaximum(List<Integer> numberList) {
		Integer max=Collections.max(numberList);
		return max;
	}

}
