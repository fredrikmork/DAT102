package no.hvl.dat102;

import java.util.Scanner;

public class SjangerKlient {

	public static void main(String[] args) {

		String sjnavn = "klassisk";
		Sjanger sjanger1 = Sjanger.finnSjanger(sjnavn);
		if (sjanger1 != null) {
			System.out.println(sjanger1);
		} else {
			System.out.println("Ikke lovlig sjanger");
		}

		int nr = 4;
		Sjanger sjanger2 = Sjanger.finnSjanger(4);
		if (sjanger2 != null) {
			System.out.println(sjanger2);

		} else {
			System.out.println("Ikke lovlig sjanger");
		}
         
		if (sjanger1 != null && sjanger2 != null) {
			if (sjanger1.compareTo(sjanger2) < 0) {
				System.out.print(sjanger1 + " ");
				System.out.println(sjanger1.ordinal());
			} else {
				System.out.println(sjanger2 + " ");
				System.out.println(sjanger2.ordinal());
			}
		}

	}
}
