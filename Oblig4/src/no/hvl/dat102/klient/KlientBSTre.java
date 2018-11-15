
package no.hvl.dat102.klient;

import no.hvl.dat102.bst.*;
import java.util.*;

class KlientBSTre {
	public static void main(String[] a) {
		// Lager BS-tre med 8 noder
		// Skriv ut i in-orden, dvs sortert
		// Sjekker om verdien 10 er i treet
		//

		final int ANTALL_NODER = 4096;
		Random tilfeldig = new Random();
		int min = 12234025;
		int maks = 0;
		double snitt;
		double temp = 0;
		for (int j = 0; j < 100; j++) {

			LinkedBST<Integer> bs = new LinkedBST<Integer>();
			Integer resultat = null;

			for (int i = 0; i < ANTALL_NODER; i++) {
				Integer element = new Integer(tilfeldig.nextInt());
				bs.leggTil(element);
			}
			System.out.println();
			System.out.println("Antall noder:  " + ANTALL_NODER);
			System.out.println("Minimumshøyde: " + (int) (Math.log(ANTALL_NODER) / Math.log(2)));
			System.out.println("Maksimumshøyde: " + (ANTALL_NODER - 1));
			System.out.println("Høyden: " + bs.height());

			if (min > bs.height()) {
				min = bs.height();
			}
			if (maks < bs.height()) {
				maks = bs.height();
			}
			temp += bs.height();

			Integer el = new Integer(10);
		}
		snitt = temp / 100;
		System.out.println("Minste høyden: " + min);
		System.out.println("Største høyden: " + maks);
		System.out.println("Snitt høyden: " + snitt);
		
		// ************************************************************************
		
		LinkedBST<Integer> bs = new LinkedBST<Integer>();
		Integer resultat = null;
		Integer el = new Integer(7);
		resultat = bs.finn(el);
		if (resultat != null)
			System.out.println("\nSoekte etter " + el + " og fant " + resultat);
		else
			System.out.println("\nSoekte etter " + el + " som ikke var i treet ");

		// //
		// ****************************************************************************
		//
		// resultat = bs.fjernMaks();
		// if (resultat != null)
		// System.out.println("\nFjernet stoerste " + resultat);
		// else
		// System.out.println("Treet er tomt");
		// System.out.println("Treet er naa: ");
		// bs.visInorden();
		//
		// //
		// ****************************************************************************
		// resultat = bs.fjernMin();
		// if (resultat != null)
		// System.out.println("\nFjernet minste " + resultat);
		// else
		// System.out.println("Tree er tomt ");
		// System.out.println("Treet er naa: ");
		// bs.visInorden();
		// //
		// ****************************************************************************
		//
		// resultat = bs.finnMin();
		// if (resultat != null)
		// System.out.println("\nMinste element " + resultat);
		// else
		// System.out.println("Treet er tomt");
		//
		// //
		// ******************************************************************************
		//
		// resultat = bs.finnMaks();
		// if (resultat != null)
		// System.out.println("\nStoerste element " + resultat);
		// else
		// System.out.println("Treet er tomt");
		//
		// //
		// ****************************************************************************
		//

	}
}// class