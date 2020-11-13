package oop;

import java.io.IOException;

public class Zellwachstum {

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte geben sie die aktuelle Zellenmenge ein: ");
		int zellen = IO.readInteger();
		System.out.println("bitte geben sie den nwachstumfaktor ein. ");
		int multi = IO.readInteger();
		System.out.println("Geben sie bitte die Menge der Tage an,");
		int tage = IO.readInteger();
		
		int starttag = 0;
		System.out.println("Tag || Zellmenge");
		
		for (int i = 0; i <= tage; i++) {
			double ende = zellen * Math.pow(multi, i);
			System.out.println(starttag + "\t" +ende);
		}
	}

}
