package com.src.nirakar.lambdaexpression;

/**
 * Implement Lambda expression
 * 
 * @author Nirakar
 */
public class LambdaExpressionImplFlavorII {

	public static void main(String[] args) {
		Converter<Integer, String> c = new Converter<Integer, String>() {
			@Override
			public String convert(Integer input) {
				return String.valueOf(input);
			}
		};
		String convert = c.convert(12);
		System.out.println(convert);
		Converter<Integer, String> c2 = (input) -> String.valueOf(input);
		String convert2 = c2.convert(13);
		System.out.println(convert2);
	}
}

@FunctionalInterface
interface Converter<I, R> {
	R convert(I input);
}
