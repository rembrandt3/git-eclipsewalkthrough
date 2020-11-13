package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Wurzel {

	public static void main(String[] args) throws IOException {
		System.out.println("Nenne den Anfangswert: ");
		int anfang = IO.readInteger();
		
		System.out.println("Nenne den Endwert: ");
		int ende = IO.readInteger();
		
		for (int i = anfang; i <= ende; i++) {
			System.out.println(Math.sqrt(i) + " ist die Quadratwurzel von " + i);
		}
		
		for (int i = anfang; i <= ende; i++) {
			System.out.println("Quadratwurzel von " + i + " = " + Math.sqrt(i));
		}

	}

}
