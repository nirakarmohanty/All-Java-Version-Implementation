package com.src.nirakar.defaultmethod;

/**
 * Example of Default Method in Interface
 * @author Nirakar
 *
 */
public interface Language {

	default void write(String language) {
		System.out.println("Yes this " + language + " is writable in forward direction ! ");
	}

	default void reverseWrite(String language) {
		System.out.println("Yes this " + language + " is writable in reverse direction ! ");
	}

	default void movingFingerRead(String language) {
		System.out.println("Yes this " + language + " is writable in by moving finger ! ");
	}

	void otherRead(String otherLanguage);
}
