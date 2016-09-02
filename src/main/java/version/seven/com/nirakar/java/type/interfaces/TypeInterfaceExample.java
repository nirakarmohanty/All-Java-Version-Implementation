package com.nirakar.java.type.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class can be described to define one of the Java 7 version features .
 * ****<B>Type Interface<B> ***** Before JDK 1.7 introduce a new operator <<,
 * known as diamond operator to making type inference available for constructors
 * as well.
 * 
 * @author NIRAKAR
 * 
 */
public class TypeInterfaceExample {

	public static void main(String[] args) {

		Map<String, List<String>> movieRecords = new HashMap<String, List<String>>();
		List<String> movieNames = new ArrayList<String>();

		movieNames.add("Devdas");
		movieNames.add("Kargil");
		movieRecords.put("Hindi", movieNames);

		System.out.println("Type Safe before java 7 ");

		Map<String, List<String>> movieRecordsNew = new HashMap<>();
		List<String> movieNamesNew = new ArrayList<>();
		
		movieNamesNew.add("Nine Queens");
		movieNamesNew.add("Most wanted man");
		movieRecordsNew.put("English", movieNamesNew);

		System.out.println("In Java 7 Implementation");
	}

}
