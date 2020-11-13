package oop;

import java.io.IOException;

public class GeometrischeReihe {

	public static void main(String[] args) throws IOException {
		//Der Benutzer gibt die Zahl ein, bis der das Programm rechnen soll.
		System.out.println("Geben sie bitte einz Zahl ein, bis der das programm rechnen soll.");
		int zahl = IO.readInteger();
		int berechnung;
		double ergebniss = 0;
		for(int i = 0; i <= zahl; i++){
          ergebniss = (1 / Math.pow(2, i)) + ergebniss;
          System.out.println(ergebniss);
        }
	}

}
