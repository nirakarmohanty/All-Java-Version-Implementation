package com.nirakar.java.annotation;

import org.junit.Test;

public class TestRetention {

	@Test
	@MySampleApp(description = "testing annotations") 
	public void testRetention(){
		System.out.println("Method executed");
	}
}
