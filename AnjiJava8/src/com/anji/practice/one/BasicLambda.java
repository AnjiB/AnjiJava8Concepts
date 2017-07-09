package com.anji.practice.one;

public class BasicLambda {

	public void printone() {
		System.out.println("Hello -- without lambda");
	}
	
	// Lambda expression should have the target type to functional interface
	// A functional interface is an interface with only one abstract method
	// In below example, we have an interface XYZ with one abstract method - printtwo()
	XYZ x = () -> {
		@SuppressWarnings("unused")
		int y = 60;
		y = 90 ;
		System.out.println("Hello with lambda");
	};
	
	public static void main(String args[]) {
		BasicLambda bl = new BasicLambda();
		bl.printone();
		bl.x.printtwo();
	}
	
}

interface XYZ {
	public void printtwo();
}
