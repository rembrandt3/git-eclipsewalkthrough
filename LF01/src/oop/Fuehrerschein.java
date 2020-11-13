package oop;

import java.io.IOException;

public class Fuehrerschein {

	public static void main(String[] args) throws IOException {
		// Eingabe des Alters.
		System.out.println("Wie alt sind sie? ");
		int alter = IO.readInteger();
		//int alter = IO.readInteger();
		//Altersprüfung.
		if (alter < 14){
			System.out.println("Du darfst ein Bobby-Car oder Fahrrad fahren. ");
		} else if (alter < 16) {
			System.out.println("du darfst schon 50er fahren. ");
		} else if (alter < 18) {
			System.out.println("Du darfst schon 125er fahren, aber kein Auto. ");
		} else {
			System.out.println("Du darfst jetzt Auto fahren. ");
		}
	}

}
