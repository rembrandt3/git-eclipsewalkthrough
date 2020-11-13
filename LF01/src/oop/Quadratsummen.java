package oop;

import java.io.IOException;

public class Quadratsummen {

	public static void main(String[] args) throws IOException {
		//Eingabe der Quadratsumme.
		System.out.println("Bitte geben sie ein Zahl ein. Von dieser Zahl berechnen wir dann die Quadratwurzel. ");
		int qua = IO.readInteger();
		int berechnung = qua *qua;
	if (qua > 0) {
		System.out.println(berechnung);
	}
		
		
		

	}

}

