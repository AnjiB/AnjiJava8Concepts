package com.anji.practice.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImplOne {
	
	/**
	 * In Java 8.0 we have new package java.util.stream to do operations on collections.
	 * We will convert the collection to stream and we will do some operations based on the need
	 * method stream() will be used to covert the collection to stream
	 * filter() is to modify
	 * collect() to collect the modified the stream of objects
	 */
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int j = 1; j <= 10; j++) {
			list.add(j);
		}	
		// Now filter the list based on some condition
		Stream<Integer> st = list.stream();
		List<Integer> filteredList = st.filter(i -> i>5).collect(Collectors.toList());
		System.out.println("Filtered list");
		filteredList.forEach(j -> System.out.print(j));
		
		// You cant use the same above Stream reference for below operation
		// coz it will be closed once you use it.
		
		// It is also possible to convert the list to array while doing the filtering as below
		Stream<Integer> st1 = list.stream();
		Integer[] filteredArray = st1.filter(i -> i<=5).toArray(Integer[]::new);
		
		// You can also convert the array to stream using Stream.of method
		//Stream<Integer> st2 = Stream.of(filteredArray);
		
		System.out.println("\nFiltered array");
		for(Integer i : filteredArray) {
			System.out.print(i.toString());
		}
	}

}
