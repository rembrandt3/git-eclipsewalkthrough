package oop;

import java.io.IOException;


public class Alterspruefung {

	public static void main(String[] args) throws IOException {


		int minderjaehrig;

		minderjaehrig = 17;


		System.out.println("Wie alt bist du? ");
		int ergebnis = IO.readInteger();
		if (ergebnis <= minderjaehrig){
			System.out.println("Du bist minderj�hrig");
		} else {
			System.out.println("Du bist vollj�hrig");
		}

	}

}
