package com.anji.practice.one;

import java.util.function.Predicate;

//Predicate is a functional§ interface in Util package which has a test method

public class PredicateImplOne {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (Integer a) -> { 
			
			if(a>10) 
				return false;
			else
				return true;
		};
		
		System.out.println("Boolean value\t" + p.test(5)) ;
	}
	
}
