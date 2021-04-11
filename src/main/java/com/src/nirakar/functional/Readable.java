package com.src.nirakar.functional;

@FunctionalInterface
interface Readable {	
	//Abstract method is mandatory
	void read();	
	//Object class methods 
	String toString();
	int hashCode();	
	
	default void letterPresent() {
		System.out.println("Yes Characcters should be present ");
	}
}
