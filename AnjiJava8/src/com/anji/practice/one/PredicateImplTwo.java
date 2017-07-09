package com.anji.practice.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImplTwo {

	public static void main(String args[]) {
		
		List<Integer> intList = (List<Integer>) Arrays.asList(10, 5, 6, 30, 50, 12, 4, 6, 78);
		Predicate<Integer> x = (Integer i) -> i > 10;
		
		System.out.println("Numbers greater than 10 in the given list are..");
		intList.forEach( y -> {
			if(x.test(y)){
				System.out.println(y);
			}
		});
	}
}
