package com.src.nirakar.defaultmethod;

import com.src.nirakar.defaultmethod.Engine;
import com.src.nirakar.defaultmethod.Body;

/**
 * Example of default method present in multiple Interfaces * 
 * @author Nirakar *
 */
public class Car implements Body, Engine {

	@Override
	public void getEnginePrice() {
		System.out.println("Mehtod [getEnginePrice] override in Car Class");
	}

	@Override
	public void getSpeed() {
		System.out.println("Mehtod [getSpeed] override in Car Class");	}

	@Override
	public void getValidity() {
		Engine.super.getValidity();
		Body.super.getValidity();
	}

	@Override
	public void getPrice() {
		Engine.super.getPrice();
		Body.super.getPrice();
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.getEnginePrice();
		c.getSpeed();
		c.getValidity();
		c.getPrice();
	}

}
