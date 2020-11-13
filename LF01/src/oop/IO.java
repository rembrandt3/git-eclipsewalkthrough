package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IO {

	/**
	 * Lieﬂt den Text von der Konsole ein.
	 * @return Der eingelesene Text.
	 */
	public static String readString() throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String eingabe = br.readLine();
		return eingabe;
	}

	public static int readInteger() throws IOException {
		while ( true) {
			try {
				String eingabe = readString();
				int zahl = Integer.parseInt(eingabe);
				return zahl;
			}
			catch (NumberFormatException e) {
				System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
			}
		}
	}

	public static double readDouble() throws IOException {
		while (true) {
			try {
				String eingabe = readString();
				double zahl = Double.parseDouble(eingabe.replace(',', '.'));
				return zahl;

			}
			catch (NumberFormatException e) {
				System.out.print("Keine Kommazahlen! Bitte erneut versuchen: ");
			}
		}
	}
	public static boolean readBoolean() throws IOException {
		while (true) {
			String eingabe = readString();
			if (eingabe.equalsIgnoreCase("1") || eingabe.equalsIgnoreCase("j")
				|| eingabe.equalsIgnoreCase("yes")
				|| eingabe.equalsIgnoreCase("y")
				|| eingabe.equalsIgnoreCase("ja")) {
				return true;
			}
			else if (eingabe.equalsIgnoreCase("nein") || eingabe.equalsIgnoreCase("no")
				|| eingabe.equalsIgnoreCase("n")){
				return false;
			}
			else {
				System.out.print("Nur 'Ja' oder 'Nein' antworten! Bitte erneut versuchen");
			}
		}
	}

}


