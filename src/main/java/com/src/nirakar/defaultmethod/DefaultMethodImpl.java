package com.src.nirakar.defaultmethod;

/**
 * @author Nirakar
 *
 */
public class DefaultMethodImpl implements Language {

	@Override
	public void otherRead(String otherLanguage) {
		System.out.println("Yes this " + otherLanguage + " is readable only for phusical handicapped people ! ");

	}

	public static void main(String[] args) {
		DefaultMethodImpl impl = new DefaultMethodImpl();
		impl.otherRead("Braille ");
		impl.movingFingerRead("Braille");
		impl.write("English");
		impl.reverseWrite("Latin");
	}
}
