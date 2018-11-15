package no.hvl.dat102.klient;

import java.util.*;

import no.hvl.dat102.metoder.*;

public class KlientBSTre {
	public static void main(String[] a) {
		// Lager BS-tre med 8 noder
		// Skriv ut i in-orden, dvs sortert
		// Sjekker om verdien 10 er i treet
		//
		final int NODER = 1024;
		Random random = new Random();
		int min = 20000000;
		int maks = 0;
		double snitt;
		double temp = 0;

		for (int i = 0; i < 100; i++) {

			KjedetBSTre<Integer> bst = new KjedetBSTre<Integer>();
			Integer resultat = null;

			for (int k = 0; k < NODER; k++) {
				Integer el = new Integer(random.nextInt());
				bst.leggTil(el);
			}
			System.out.println();
			System.out.println("Antall noder: " + NODER);
			System.out.println("Teoretisk minimumshøyde: " + (int) ((Math.log(NODER) / Math.log(2)) - 1));
			System.out.println("Teoretisk maksimumshøyde: " + (NODER - 1));
			System.out.println("Teoretisk høyde:" + bst.finnHoyde());

			if (min > bst.finnHoyde()) {
				min = bst.finnHoyde();
			}
			if (maks < bst.finnHoyde()) {
				maks = bst.finnHoyde();
			}
			temp += bst.finnHoyde();
			
			Integer element = new Integer(10);
		}
		snitt = temp/100;
		System.out.println();
		System.out.println("Faktisk minimumshøyde på treet: " + min);
		System.out.println("Faktisk maksimumshøyde på treet: " + maks);
		System.out.println("Gjennomsnittlig høyde på trærne: " + snitt);
	}
}
// ************************************************************************
/*
 * resultat = bs.finn(el); if (resultat != null)
 * System.out.println("\nSoekte etter " + el + " og fant " + resultat); else
 * System.out.println("\nSoekte etter " + el + " som ikke var i treet ");
 * 
 * //
 * ****************************************************************************
 * 
 * resultat = bs.fjernMaks(); if (resultat != null)
 * System.out.println("\nFjernet stoerste " + resultat); else
 * System.out.println("Treet er tomt"); System.out.println("Treet er n�: ");
 * bs.visInorden();
 * 
 * //
 * ****************************************************************************
 * resultat = bs.fjernMin(); if (resultat != null)
 * System.out.println("\nFjernet minste " + resultat); else
 * System.out.println("Tree er tomt "); System.out.println("Treet er n�: ");
 * bs.visInorden(); //
 * ****************************************************************************
 * 
 * resultat = bs.finnMin(); if (resultat != null)
 * System.out.println("\nMinste element " + resultat); else
 * System.out.println("Treet er tomt");
 * 
 * //
 * *****************************************************************************
 * *
 * 
 * resultat = bs.finnMaks(); if (resultat != null)
 * System.out.println("\nStoerste element " + resultat); else
 * System.out.println("Treet er tomt");
 * 
 * //
 * ****************************************************************************
 * 
 * } }// class
 */