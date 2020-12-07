package oop;

import java.io.IOException;

public class Lieferbeziehungen {

	//Erstellung der Werte.
	public static void main(String[] args) throws IOException {
		System.out.println("Bitte geben sie die anzahl der Matrizen an. ");
		System.out.print("Anzahl Artikel - ");
		int artikel = IO.readInteger();
		System.out.print("Anzahl Kunden - ");
		int kunden = IO.readInteger();
		int[][] januar = new int [artikel][kunden];
		int[][] febuar = new int [artikel][kunden];
		int[][] summe = new int [artikel][kunden];
		int[] artikelSumme = new int[artikel];
		int[] kundenSumme = new int [kunden];
		int gesamtSumme = 0;

		//Eingabe von Januar.
		System.out.println("\nBitte geben sie die Artikel Anzahl für Januar an. ");
		for (int i = 0; i < januar.length; i++) {
			System.out.println("Artikel: "+(i+1)+"\t");
			for (int j = 0; j < januar[i].length; j++) {
				System.out.print("Kunde"+(i+1)+": ");
				januar[i][j] = IO.readInteger();

			}

		}

		//Eingabe von Febuar.
		System.out.println("\nBitte geben sie die Artikel Anzahl für Febuar an. ");
		for (int i = 0; i < febuar.length; i++) {
			System.out.println("Artikel: "+(i+1)+"\t");
			for (int j = 0; j < febuar[i].length; j++) {
				System.out.print("Kunde"+(i+1)+": ");
				febuar[i][j] = IO.readInteger();
			}
		}
		
		//Berechnung
		for (int i = 0; i < januar.length; i++) {
			for (int j = 0; j < januar[i].length; j++) {
				summe[i][j] = januar [i][j] + febuar[i][j];
				artikelSumme[i] += summe[i][j];
				kundenSumme[j] += summe[i][j];
				gesamtSumme += summe[i][j];
			}
		}
		
		//Ausgabe
		System.out.println("\n");
		System.out.print("Kunde\t\t");
		for (int i = 0; i < januar.length; i++) {
			System.out.print(+(i+1)+"\t");	
		}
		System.out.print("|ArtikelSummen: ");
		System.out.println("\n**************************");
		
		for (int i = 0; i < januar.length; i++) {
			System.out.print("Artikel: "+(i+1)+"\t");
			for (int j = 0; j < januar[i].length; j++) {
				System.out.print(summe[i][j]+"\t");
				
			}
			System.out.print("|"+artikelSumme[i]+"\n");
			
		}
		System.out.println("\n**************************");
		System.out.print("Kunden Summen: \t");
		for (int i = 0; i <kunden; i++) {
			System.out.print(kundenSumme[i]+"\t");
			
			
		}
		
		System.out.println("\n**************************");
		System.out.println("Gesamt Summe: \t "+gesamtSumme);
		
		
		
		
	}
}

