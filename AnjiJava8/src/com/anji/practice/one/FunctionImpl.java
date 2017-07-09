package com.anji.practice.one;

import java.util.function.Function;

//Function in Util package returns only one Object by taking only object as input
// the above implementation is provided in apply method
// Function is an functional interface

public class FunctionImpl {
	public static void main(String[] args) {
		Function<String,Integer> myStringLength = (str) -> str.length();
		Function<Integer, Boolean> isMyNumberEven = (x) -> x % 2 == 0;
		String eString = "Anji loves comedy films";
		System.out.println("Length of the above string is:\t" + myStringLength.apply(eString));
		System.out.println("Evenity of Length of the above string is:\t" + isMyNumberEven.apply(myStringLength.apply(eString)));
	}
}
