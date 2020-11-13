package oop;

import java.io.IOException;

public class Sparvertrag {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben sie ihr Kapital ein.");
		double kapital = IO.readDouble();
		
		System.out.println("Bitte geben sie den Zinssatz ein.");
		double zinssatz = IO.readDouble();
		
		System.out.println("Bitte geben sie die Laufzeit der Jahre an.");
		int jahre = IO.readInteger();
		
		double endbetrag = 0;
		System.out.println("Jahre" + "\t" + "Kapital" + "\t" + "Zinssatz" + "\t" + "Endbetrag" + "\t");
		System.out.println(jahre + "|" + kapital + "|" + zinssatz + "|" + endbetrag);
		
		
	}

}
