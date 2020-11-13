package oop;

import java.io.IOException;

public class Bestellungen {

	public static void main(String[] args) throws IOException {
	System.out.println("Wie viele Schrauben sollen gekauft werden?");
	int anzahlSchrauben = IO.readInteger();
			System.out.println("Wie viele Muttern sollen gekauft werden?");
	int anzahlMuttern = IO.readInteger();
	System.out.println("Wie viele Unterlegscheiben sollen gekauft werden?");
	int anzahlUnterlegscheiben = IO.readInteger();
	double preis = anzahlSchrauben * 0.5 + anzahlMuttern * 0.3 + anzahlUnterlegscheiben * 0.01;
	System.out.println("Die Bestellung kostet" + preis + "Euro");
	if (anzahlSchrauben == anzahlMuttern) {
			System.out.println("Die bestellung ist ok.");
	} else {
		System.out.println("Sie sollten die Bestellung überprüfen.");
	}
	
	}

}
