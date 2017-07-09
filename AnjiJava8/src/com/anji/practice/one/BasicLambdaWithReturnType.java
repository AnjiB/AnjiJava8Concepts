package com.anji.practice.one;

public class BasicLambdaWithReturnType {
	
	Mime mime = (int a, int b) -> {
		return a+b;
	};

	public static void main(String[] args) {

		BasicLambdaWithReturnType x = new BasicLambdaWithReturnType();
		int sum = x.mime.sum(10, 20);
		System.out.println("sum of 10, 20 is:\t" + sum);
		
	}

}

interface Mime {
	
	public int sum(int a, int b);
}
