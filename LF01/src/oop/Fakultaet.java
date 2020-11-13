package oop;

import java.io.IOException;

public class Fakultaet {

	public static void main(String[] args) throws IOException {
		// Wert eingaben.
		System.out.println("Bitte geben sie die Faukltät ein.");
		int fak = IO.readInteger();
		int ergebnis = 1;

		for(int i = 1; i <= fak; i = i + 1) {
			ergebnis = ergebnis * i;
		}
		System.out.println(ergebnis);
	}

}
	