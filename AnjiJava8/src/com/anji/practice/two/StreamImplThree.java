package com.anji.practice.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImplThree {
	
	public static void main(String[] args) {
		
		List<String> fruitList = Arrays.asList("Banaana", "Apple", "", "Kiwi", "Pomegranate", "Plum", "Pear", "Guava", "Papaya", "Orange", "Grape", "Berry");
		
		// Sort the frutiList using sort method
		Stream<String> sortedStr = fruitList.stream().sorted();
		sortedStr.forEach(System.out::println);
		
		//Count
		int count = (int) fruitList.stream().count();
		System.out.println("count is:\t" + count);
		
		// filter 
		List<String> pList = fruitList.stream().filter(x -> x.startsWith("P")).collect(Collectors.toList());
		pList.stream().forEach(System.out::println);
		
		// convert all to upper using map
		String[] allUp = fruitList.stream().map(x->x.toUpperCase()).toArray(String[]::new);
		Stream.of(allUp).forEach(System.out::println);
	}

}
