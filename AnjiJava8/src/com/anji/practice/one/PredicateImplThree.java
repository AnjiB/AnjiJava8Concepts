package com.anji.practice.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImplThree {

	public static void main(String[] args) {
		
		List<Integer> x = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
		Predicate<Integer> isEven = (Integer i) -> i%2 == 0;
		System.out.println("Even numbers in the list are..");
		x.forEach(z -> {
			if(isEven.test(z))
				System.out.println(z);
		});

		System.out.println("\n");
		Predicate<Integer> isOdd = (Integer i) -> i%2 != 0;
		checkOdd(isOdd, x);
	}
	
	public static void checkOdd(Predicate<Integer> predicate, List<Integer> list) {
		System.out.println("Odd numbers in the list are..");
		list.forEach(z -> {
			if(predicate.test(z))
				System.out.println(z);
		});
	}

}
