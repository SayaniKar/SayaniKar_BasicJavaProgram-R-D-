package IterateMapUsingforEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Employee> map=new HashMap<>();
		map.put(100,new Employee("Sayani","aa@gmail.com",9000.0));
		Set<Entry<Integer,Employee>>entrySet=map.entrySet();
		for(Entry<Integer,Employee>entry:entrySet){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}

	}

}
