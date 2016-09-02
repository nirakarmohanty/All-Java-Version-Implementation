/**
 * Sep 2, 2016NIRAKAR
 */
package com.nirakar.java.multi.exception;

/**
 * @author NIRAKAR
 * 
 */
public class MultiCatchException {

	/**
	 * Method describes to catch multiple exception.
	 */
	public void getMovieDetails() {
		try {
			int movieArray[] = new int[5];
			movieArray[5] = Integer.parseInt("HXBX");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException  e) {
			System.out.println("You are so fool to assign a movie name ...");
		}

		System.out.println("Better luck for next time ...");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiCatchException multiCatchException= new MultiCatchException();
		multiCatchException.getMovieDetails();

	}

}
