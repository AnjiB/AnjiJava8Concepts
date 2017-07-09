package com.anji.practice.two;

import java.util.stream.Stream;

public class StreamImplTwo {

	public static void main(String[] args) {
		//generate() method executes continuously	
		Stream<Double> randomStream = Stream.generate(() -> {
			return Math.random();
		});
		randomStream.forEach(System.out::println);
	}
}
