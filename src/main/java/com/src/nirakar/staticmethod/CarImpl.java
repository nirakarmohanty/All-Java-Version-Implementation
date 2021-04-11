package com.src.nirakar.staticmethod;

public class CarImpl implements Car{

	@Override
	public String getCarName(String name) {
		return "Car Name is " + name;
	}

	public static void main(String[] args) {
		CarImpl carImpl = new CarImpl();
		carImpl.getCarName("Maruti");
		Car.checkAirPressure();
		Car.cleanBody();
	}
}
