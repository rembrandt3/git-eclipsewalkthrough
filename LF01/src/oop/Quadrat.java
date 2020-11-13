package oop;

import java.io.IOException;

public class Quadrat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben sie die Größe des Quadrates an: ");
		int size = IO.readInteger();

		for(int i = 0; i < size; i++){
			System.out.print("*");
		}

		System.out.println("");

		for(int i = 0; i < size - 2; i++){
			System.out.print("*");
			for (int is = 0; is < size - 2; is++){
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for(int i = 0; i < size; i++){
			System.out.print("*");
		}

		
	}
}