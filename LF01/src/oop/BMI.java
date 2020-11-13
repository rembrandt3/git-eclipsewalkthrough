package oop;

import java.io.IOException;

public class BMI {

	public static void main(String[] args) throws IOException {
		// Werte eingaben.
		System.out.println("Bist du (m) männlich oder (w) Weiblich? ");
		String geschlecht = IO.readString();
		System.out.println("Bitte geben sie ihr gewicht in kg ein. ");
		double gewicht = IO.readDouble();
		System.out.println("Bitte geben sie ihre Größe in cm ein. ");
		double groesse = IO.readDouble();
		// BMI berechnen.
		double bmi = gewicht / Math.pow(groesse / 100.0, 2);

		// BMI auswerten.
		if (geschlecht.equalsIgnoreCase("m")) {
			if (bmi < 20) {
				System.out.println("Untergewicht");

			} else if (bmi < 25) {
				System.out.println("Normalgewicht");
			} else if (bmi < 30) {
				System.out.println("Übergewicht");
			} else if (bmi < 40) {
				System.out.println("Adipositas");
			} else {
				System.out.println("Starke Adipositas");
			}
		}
		// BMI auswerten.
		else if (geschlecht.equalsIgnoreCase("w")) {
			if (bmi < 19) {
				System.out.println("Untergewicht");

			} else if (bmi < 24) {
				System.out.println("Normalgewicht");
			} else if (bmi < 30) {
				System.out.println("Übergewicht");
			} else if (bmi < 40) {
				System.out.println("Adipositas");
			} else {
				System.out.println("Starke Adipositas");
			}

		}
		else {
			System.out.println("Keine Berechnung möglich, da deine Eingabe zum Geschlecht nicht gültig ist. ");
		}


	}

}
