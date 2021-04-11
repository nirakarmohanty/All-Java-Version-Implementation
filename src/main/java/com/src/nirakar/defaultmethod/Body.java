package com.src.nirakar.defaultmethod;

public interface Body {

	void getSpeed();

	default void getPrice() {
		System.out.println("Inide getPrice method of Body Interface");
	}

	default void getValidity() {
		System.out.println("Inide getValidity method of Body Interface");
	}

	
}
