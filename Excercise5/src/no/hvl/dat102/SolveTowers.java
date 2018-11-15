package no.hvl.dat102;

import java.util.Scanner;

public class SolveTowers {
	public static void main(String[] args) {
		TowersOfHanoi tower1 = new TowersOfHanoi(31);
		long before = System.nanoTime();
		tower1.solve();
		long after = System.nanoTime();
		System.out.println("Antall flyttinger: " + tower1.antall);
		System.out.println("Nanosekunder: " + (after - before));
	}
}
