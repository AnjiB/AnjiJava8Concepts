package com.anji.practice.one;

public class InterfaceWithDefaultMethod implements DefaultInterface {

	@Override
	public void anji() {
		System.out.println("this is anji..");
	}
	
	// Still I can provide my own implementation to default method 
	@Override
	public int anji2(int a, int b) {
		System.out.println("Multiplication of two numbers is :\t" + (a*b));
		return a*b;
	}
	
	public static void main(String args[]) {
		
		DefaultInterface defaultInterface = new InterfaceWithDefaultMethod();
		defaultInterface.anji();
		int x = defaultInterface.anji1(10,  20);
		int y = defaultInterface.anji2(10, 5);
		System.out.println("Values from main method are:\t" + x + "\t" + y);
	}

}

interface DefaultInterface {
	public void anji();
	default int anji1(int a, int b) {
		System.out.println("Sum of two numbers is :\t" + (a+b));
		return a+b;
	}
	
	default int anji2(int a, int b) {
		System.out.println("Sum of two numbers is :\t" + (a+b));
		return a+b;
	}
}
