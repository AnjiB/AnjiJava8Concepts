package com.anji.practice.one;

public class LambdaForAnonymousInnerClass {
	
	
	public static void main(String args[]) {
		
		XYZ1 x = new XYZ1() {
			public void mango() {
				System.out.println("hi");
			}
		};
		
		x.mango();
		
		/////////////
		
		Tomato t = () -> {System.out.println("hello");};
		t.tomato();
		
	}
	
}

interface XYZ1 {
	public void mango() ;
}

interface Tomato {
	public void tomato();
}

abstract class Tomato1 {
	public abstract void tomato();
}
