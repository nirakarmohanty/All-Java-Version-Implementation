package com.nirakar.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Stream - Filter and Collect
 * 
 * @author NIRAKAR
 *
 */
public class StreamExample1 {

	private static List<String> collect;

	public static void main(String[] args) {
		// 1.Print the stram
		getList().stream().forEach(action -> {
			System.out.printf(action);
			System.out.println("\t");
		});
		System.out.println("-------------------------------");

		// 2. Filter and collect the stream
		collect = getList().stream()
				.filter(predicate -> predicate.startsWith("B"))
				.collect(Collectors.toList());
		collect.stream().forEach(action -> System.out.println(action));
		System.out.println("-------------------------------");

		// 3.Streams filter(), findAny()
		String findAny = getList().stream()
				.filter(predicate -> predicate.equalsIgnoreCase("Paris"))
				.findAny().get();
		System.out.println(findAny);
		System.out.println("-------------------------------");
		// 4.Streams filter(), findFirst()
		String findFirstResult = getList().stream()
				.filter(predicate -> predicate.equalsIgnoreCase("Paris"))
				.findFirst().get();
		System.out.println(findFirstResult);
		System.out.println("-------------------------------");
		// 5.Streams filter(), findFirst() orElse
		String orElseExample = getList().stream()
		.filter(predicate -> predicate.equalsIgnoreCase("Bhubaneswar"))
		.findFirst()
		.orElse("NotFound");
		System.out.println(orElseExample);
	}

	public static List<String> getList() {

		return Arrays.asList("Budapest", "Berlin", "Paris", "Denmark",
				"Vienna", "Austria");
	}
}
