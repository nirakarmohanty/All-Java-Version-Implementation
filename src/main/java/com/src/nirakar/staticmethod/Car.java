package com.src.nirakar.staticmethod;

/**
 * 
 * @author Nirakar
 */
@FunctionalInterface
public interface Car {
	
	String getCarName(String name);
	
	static void cleanBody() {
		System.out.println("Clena car body");
	}
	static void checkAirPressure() {
		System.out.println("check Air Pressure of all wheels");
	}
	
	
}
