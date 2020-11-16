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
	
	/**
	 * Lieﬂt ein eindimesionales Array von Ganzzahlen von der Konsole ein.
	 * @return Ein eindimesionales Arry.
	 * @throws IOException
	 */
	public static int[] readIntergerArray1D() throws IOException {
		System.out.println("Wie viele Werte? ");
		int zeilen = readInteger();
		int[] array = readIntergerArray1D(zeilen);
		return array;
	}
	/**
	 * Lieﬂt ein eindimesionales Array von Ganzzahlen von der Konsole ein.
	 * @param anzahlWerte Die Anzahl der Array Elemente
	 * @return Ein eindimesionales Arry.
	 * @throws IOException
	 */
	public static int[] readIntergerArray1D(int anzahlWerte) throws IOException {
		int[] array = new int [anzahlWerte];
		array = readIntergerArray1D(array);
		return array;
	}
	/**
	 * Lieﬂt ein eindimesionales Array von Ganzzahlen von der Konsole ein.
	 * @param array Das zu f¸llende Array.
	 * @return Ein eindimesionales Arry.
	 * @throws IOException
	 */
	public static int[] readIntergerArray1D(int[] array) throws IOException {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Wert eingeben f¸r [" + i + "]: ");
			array[i] = readInteger();
			
			
		}
		return array;
	}

}


