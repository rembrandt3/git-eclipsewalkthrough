package oop;

import java.io.IOException;

public class Temperaturmessung {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		System.out.println("Geben sie bitte den 1.Tag ein");
		int tag1 = IO.readInteger();
		System.out.println("Geben sie bitte den 2.Tag ein");
		int tag2 = IO.readInteger();
		System.out.println("Geben sie bitte den 3.Tag ein");
		int tag3 = IO.readInteger();
		System.out.println("Geben sie bitte den 4.Tag ein");
		int tag4 = IO.readInteger();
		System.out.println("Geben sie bitte den 5.Tag ein");
		int tag5 = IO.readInteger();
		System.out.println("Geben sie bitte den 6.Tag ein");
		int tag6 = IO.readInteger();
		System.out.println("Geben sie bitte den 7.Tag ein");
		int tag7 = IO.readInteger();
		
		for (int i = 1; i < 0; i++) {
			int endergebis = (tag1 + tag2 + tag3 + tag4+ tag5 + tag6 + tag7) / 7;
			System.out.println(endergebis);
			
		}

	}

}
