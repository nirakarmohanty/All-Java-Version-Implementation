/**
 * 
 */
package com.src.nirakar.optionalclass;

import java.util.Optional;

/**
 * @author Nirakar
 *
 */
public class OptionaClassFlavorI {

	
	public static void main(String[] args) {
		
		String[] array= new String[10];
		System.out.println(array[5].toLowerCase());
		Optional<Object> empty = Optional.empty();
		System.out.println(empty.toString());
	}

}
