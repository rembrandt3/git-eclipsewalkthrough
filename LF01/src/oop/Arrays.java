package oop;

import java.io.IOException;

public class Arrays {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		double [] tage = new double [7];
		for (int j = 0; j < tage.length; j++) {
			System.out.println("Bitte geben Sie den Wert für Tag " + (j + 1) +" ein. ");
			tage [j] = IO.readDouble();
		}
		System.out.println(tage);
	}


}
