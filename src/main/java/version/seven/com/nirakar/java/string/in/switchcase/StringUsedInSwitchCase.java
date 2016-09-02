package com.nirakar.java.string.in.switchcase;

/**
 * This class can be described to define one of the Java 7 version features .
 * **** String can be used in Switch Case********** Before JDK 7, only integral
 * types can be used as selector for switch-case statement. In JDK 7, you can
 * use a String object as the selector
 * 
 * 
 * @author NIRAKAR
 * 
 */
public class StringUsedInSwitchCase {

	/**
	 * THis method takes input as your mood status and suggest a movie name . So funny , isn't it . 
	 * @param moodStatus
	 */
	public  void findBestMovieForYourChoice(String moodStatus) {
		
		switch ("Mood: "+moodStatus) {
		
			case "Mood: Beautiful":
				System.out.println("The Fundamentals of Caring : (2016)");
				break;
			case "Mood: Emotional":
				System.out.println("The Diving Bell and the Butterfly : (2007)");
				break;
			case "Mood: Romantic":
				System.out.println("The Perks of Being a Wallflower : (2012)");
				break;
			case "Mood: Touching":
				System.out
						.println("Things We Lost in the Fire : (2007)");
				break;
			case "Mood: Heartfelt":
				System.out.println("The Way Way Back : (2013)");
				break;
			default:
				throw new IllegalArgumentException();
		}
	}

	/**
	 * This method implements switch case using String parameter.
	 * 
	 * @param str
	 */
	private void switchMethodExample(String str) {

		switch (str) {
		case "A":
			System.out.println("A : Apple");
			break;
		case "B":
			System.out.println("B : Ball");
			break;
		default:
			System.out.println("You are fool :)");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringUsedInSwitchCase stringUsedInSwitchCase = new StringUsedInSwitchCase();
		stringUsedInSwitchCase.switchMethodExample("A");
		stringUsedInSwitchCase.findBestMovieForYourChoice("Heartfelt");
	}

}
