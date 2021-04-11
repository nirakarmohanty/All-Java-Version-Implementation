package com.src.nirakar.functional;

public class ConsumerFunctionalImpl {

	public static void main(String[] args) {
		ConsumerFunctional c = num -> System.out.println(num);
		c.consume(12);
		c.consume("10d");
	}

}
