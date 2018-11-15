package no.hvl.dat102;

import java.util.Scanner;

public class EnumKlient3 {

	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);
		Arbeidsdag[] dag = Arbeidsdag.values();
		double timer = 0;
		double sum = 0;
		
        //løkke 1
		for (int i = 0; i < dag.length; i++) {
			System.out.println("Oppgi arbeidstimer for " + dag[i] + " :");
			timer = tastatur.nextDouble();
			sum = sum + timer;
		}

		System.out.println("Totalt antall arbeidstimer = " + sum);		
		System.out.println("\n\n");

		
	//Løkke2 Foretrukket
	timer = 0;
	sum = 0;
	for (Arbeidsdag d : dag) {
		System.out.println("Oppgi arbeidstimer for " + d + " :");
		timer = tastatur.nextDouble();
		sum = sum + timer;
	}

	System.out.println("Totalt antall arbeidstimer = " + sum);
	}

}
