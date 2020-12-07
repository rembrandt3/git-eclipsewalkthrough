package oop;

import java.io.IOException;

public class Kino {

	private static String [][] erzeugenSaal() throws IOException {
		System.out.println("Bitte geben sie die Anzahl der Reihen an. ");
		int reihen = IO.readInteger();
		System.out.println("Bitte geben sie die anzahl der Sitze pro Reihe an. ");
		int spalten = IO.readInteger();
		String[][] saal = new String [reihen][spalten];
		for (int i = 0; i < saal.length; i++) {
			for (int j = 0; j < saal[i].length; j++) {
				saal[i][j]="O";
			}
			}
		return saal;	
		}
	private static void anzeigenSaal(String [][] saal) {
		for (int i = 0; i < saal.length; i++) {
			System.out.println("Platz"+(i++)+"\t");
			for (int j = 0; j < saal[i].length; j++) {
				System.out.print(saal[i][j]);
			}
			System.out.println();
		}
	}
	public static void main (String[] args) throws  IOException {
		String [][] kino =erzeugenSaal();
	anzeigenSaal(kino);
	}
	
	private static void reservierenPlatz(String[][] saal) throws IOException {
		System.out.println("In welcher Reihe möchten sie reservieren? ");
		int reihen = IO.readInteger() - 1;
		System.out.println("Welchen platz möchten sie reservieren? ");
		int sitz = IO.readInteger() - 1;
		if (saal[reihen][sitz].equalsIgnoreCase("X")) {
			System.out.println("Der Platz ist leider schon reserviert. ");
		} else {
			saal[reihen][sitz] = "X";
		}

	}
	private	static void stornierenPlatz(String[][] saal) throws IOException {
		System.out.println("In welcher Reihe möchten sie stornieren? ");
		int reihen = IO.readInteger() - 1;
		System.out.println("Welchen platz möchten sie stornieren? ");
		int sitz = IO.readInteger() - 1;
		if (saal[reihen][sitz].equalsIgnoreCase("O")) {
			System.out.println("Der Platz ist nicht reserviert. ");
		} else {
			saal[reihen][sitz] = "O";
	}
	}
	public static void main (String[][] args) throws  IOException {
		String [][] kino =erzeugenSaal();
		anzeigenSaal(kino);
		boolean beenden = false;
		do { 
			System.out.println("Sie haben folgende Möglichkeiten:");
			System.out.println("1 = Programm beenden. ");
			System.out.println("2 = Platz reservieren.");
			System.out.println("3 = Platz stornieren.");
			int auswahl =IO.readInteger();
			if (auswahl == 1) {
				System.out.println("Vielen Dank und auf Wiedersehen");
				beenden = false;
			} else if (auswahl == 2) {
				reservierenPlatz(kino);
				anzeigenSaal(kino);
			} else if (auswahl == 3) {
				stornierenPlatz(kino);
				anzeigenSaal(kino);
			} else {
				System.out.println("Das ist kein gültiger Befehl! ");
			}
		} while (beenden == false);

	
}
}
