package no.hvl.dat102;

import java.util.Scanner;

public class EnumKlient2 {

	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);
		Arbeidsdag dag = null;

		do {
			System.out.print("Oppgi en arbeidsdag: ");
			String svar = tastatur.nextLine();
			dag = finnArbeidsdag(svar);
			if(dag == null){
				System.out.println("Ikke en arbeidsdag\n");
			}
		} while (dag == null);

		switch (dag) {
		case MANDAG:
			System.out.println("Dårlig dag\n");
			break;
		case TIRSDAG:
		case ONSDAG:
		case TORSDAG:
			System.out.println("Ikke så gale\n");
			break;
		case FREDAG:
			System.out.println("Topp\n");
			break;
		} // Ikke behov for default her

	}// main

	//Metoden sjekker om strengen svarer til en arbeidsdag.
	//Returnerer arbeidsdag ved funn ellers returneres null
	public static Arbeidsdag finnArbeidsdag(String navn) {
		Arbeidsdag adag = null;
		for (Arbeidsdag dag : Arbeidsdag.values()) {
			if (dag.toString().equals(navn.toUpperCase())) {
				adag = dag;
				break;
			}
		}
		return adag;
	}// metode

}// class
