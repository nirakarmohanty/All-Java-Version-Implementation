package com.src.nirakar.lambdaexpression;

/**
 * Implement Lambda expression
 * 
 * @author Nirakar
 */
public class LambdaExpressionImplFlavorI {

	public static void main(String[] args) {
		
		
		LanguageSpeak langSpeakFlavorI = (language) -> {
			System.out.println("I am capable of Speaking " + language +
					" Language ");
		};

		LanguageSpeak langSpeakFlavorII = (language) -> System.out
				.println("I am capable of Speaking " + language + 
						" Language ");

		// Read Language
		LanguageRead languageRead = (language) -> true;

		LanguageWrite languageWrite = (language, isExpert) -> System.out
				.println("yes I can write langauge " + language + 
						" and are you also Expert ? " + isExpert);

		System.out.println(languageRead.read("Oriya"));
		
		languageWrite.write("English", "yes");
		langSpeakFlavorI.speak("Hindi");
		langSpeakFlavorII.speak("Sanskrit");
		
		

	}
}
