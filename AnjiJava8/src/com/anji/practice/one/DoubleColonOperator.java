package com.anji.practice.one;

import java.util.function.Function;

// :: refers to methods and constructor

public class DoubleColonOperator {

	String name;
	
	DoubleColonOperator (String x) {
		name =  x;
	}
	
	public int length() {
		Function<String, Integer> f = (String str) -> str.length();
		Integer len = f.apply(name);
		return len;
	}
	
	public static void main(String[] args) {
		
		Anji a = DoubleColonOperator :: new;
		DoubleColonOperator d = a.anji("anji");
		System.out.println("len is:\t" + d.length());
		
		Anji a1 = (String blow) -> {
			return new DoubleColonOperator(blow);
		};
		
		System.out.println("len is:\t" + a1.anji("mindblow").length());
	}
	
}

// functional interface
interface Anji {
	public DoubleColonOperator anji(String str);
}
