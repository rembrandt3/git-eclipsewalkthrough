package oop;

import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie heiﬂt du?");
		String name = IO.readString();
		System.out.println("Moin " + name);

		System.out.print("Wie alt bist Du? ");
		int zahl = IO.readInteger();

		System.out.print("Wieviel kg wiegst Du: ");
		double gewicht = IO.readDouble();
		
		System.out.println("Magst du Pizza Salami?");
		boolean pizzaSalami= IO.readBoolean();
	}
	
	

}




