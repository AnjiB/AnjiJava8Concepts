package com.anji.practice.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpFour {

	// and() is equal to Logical AND / &&
	// or() is equal to Logical OR / ||
	// negate() is equal to Logical NOT / ~
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1, 2, 3, 7, 9, 10, 11, 15, 18, 19, 20, 26, 27, 29);
		Predicate<Integer> greaterThanEqualTo = (Integer i) -> i >= 10;
		Predicate<Integer> lesserThanEqualTo = (Integer j) -> j <= 20;
		System.out.println("numbers greater than equal 10 and less than equal 20 are");
		checkOne(greaterThanEqualTo.and(lesserThanEqualTo), myList);
		System.out.println("numbers less than 10 and greater than 20 are");
		checkOne(greaterThanEqualTo.and(lesserThanEqualTo).negate(), myList);
		
	}
	
	public static void checkOne(Predicate<Integer> p1, List<Integer> list) {
		list.forEach( z -> {
			if(p1.test(z))
				System.out.println(z);
		});
	}
}
