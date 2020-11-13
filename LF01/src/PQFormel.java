import oop.IO;

import java.io.IOException;

public class PQFormel {

	public static void main(String[] args) throws IOException {
		// Eingabe
		System.out.println("Bittegeben sie q ein: ");
		double q = IO.readDouble();
	    System.out.println("Bitte geben sie p ein: ");
		double p = IO.readDouble();
		
		// Verarbeitung / Rechnung
		double x1 = -p/2 + Math.sqrt(Math.pow(p/2, 2) - q);
		double x2 = -p/2 - Math.sqrt(Math.pow(p/2, 2) - q);
		
		// Ausgabe der Ergebnisse
		System.out.println("Die erste Nullestelle liegt bei x = " + x1);
		System.out.println("Die zweite Nullestelle liegt bei x = " + x2);
	}

}
