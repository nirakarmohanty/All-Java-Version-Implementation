package com.src.nirakar.lambdaexpression;

/**
 * Implement Annonymous methods without Lambda expression
 * @author Nirakar 
 */
public class WithoutLambdaExample {

	public static void main(String[] args) {

		Songs hindiSong = new Songs() {
			@Override
			public void sing() {
				System.out.println("I am able to sing Hindi songs ");
			}
		};
		hindiSong.sing();

		Games cricket = new Games() {
			@Override
			public void play(String name) {
				System.out.println("I can play " + name);
			}
		};
		cricket.play("Cricket");
	}
}

interface Songs {
	void sing();
}

interface Games {
	void play(String name);
}