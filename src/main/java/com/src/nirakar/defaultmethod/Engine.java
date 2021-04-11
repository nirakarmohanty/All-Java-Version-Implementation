package com.src.nirakar.defaultmethod;

public interface Engine {
	void getEnginePrice();

	default void getPrice() {
		System.out.println("Inide getPrice method of Engine Interface");
	}

	default void getValidity() {
		System.out.println("Inide getValidity method of Engine Interface");
	}

}
