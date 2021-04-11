package com.src.nirakar.functional;

public class FunctionalInterfaceExample implements Readable{

	@Override
	public void read() {
		System.out.println("Functional Interface example Implemented");		
	}
	@Override
	public String toString() {
		System.out.println("To String methos");
		return "";
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
		obj.read();
	}
	
}
