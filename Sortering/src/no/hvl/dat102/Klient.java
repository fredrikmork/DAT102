package no.hvl.dat102;

import java.util.Random;
import java.util.Scanner;

public class Klient {

	public static void main(String[] args) {
		final int SIZE = 20;
		Random rand = new Random(5);
		int[] test = new int[SIZE];

		for (int i = 0; i < test.length; i++) {
			test[i] = rand.nextInt(10);
		}

		Quick quick = new Quick();
		Boble boble = new Boble();
		Flette flette = new Flette();
		Innsetting innsetting = new Innsetting();
		Radix radix = new Radix();
		Utvalg utvalg = new Utvalg();
		HybridSortering hybrid = new HybridSortering();

		Scanner sc = new Scanner(System.in);
		System.out.println("|---------Sortering---------|");
		System.out.println("For QuickSort skriv inn 1.");
		System.out.println("For BubbleSort skriv inn 2.");
		System.out.println("For MergeSort skriv inn 3.");
		System.out.println("For InsertionSort skriv inn 4.");
		System.out.println("For RadixSort skriv inn 5.");
		System.out.println("For SelectionSort skriv inn 6.");
		System.out.println("For HybridSort sammenlignet med Quicksort skriv inn 7.");
		System.out.println("|---------------------------|");
		int valg = sc.nextInt();
		switch (valg) {
		case 1:
			long start = System.currentTimeMillis();
			quick.sort(test);
			long end = System.currentTimeMillis();
			System.out.println();
			System.out.println(end - start + " MS");
			break;

		case 2:
			long start1 = System.currentTimeMillis();
			boble.bubbleSort(test);
			long end1 = System.currentTimeMillis();
			System.out.println();
			System.out.println(end1 - start1 + " MS");
			break;

		case 3:
			long start2 = System.currentTimeMillis();
			flette.mergeSort(test);
			long end2 = System.currentTimeMillis();
			System.out.println();
			System.out.println(end2 - start2 + " MS");
			break;

		case 4:
			long start3 = System.currentTimeMillis();
			innsetting.insertionSort(test);
			long end3 = System.currentTimeMillis();
			System.out.println();
			System.out.println(end3 - start3 + " MS");
			break;

		case 5:
			long start4 = System.currentTimeMillis();
			radix.sort(test);
			long end4 = System.currentTimeMillis();
			System.out.println();
			System.out.println(end4 - start4 + " MS");
			break;

		case 6:
			long start5 = System.currentTimeMillis();
			utvalg.selectionSort(test);
			long end5 = System.currentTimeMillis();
			System.out.println();
			System.out.println(end5 - start5 + " MS");
			break;

		case 7:
			long start6 = System.currentTimeMillis();
			hybrid.sort(test);
			long end6 = System.currentTimeMillis();
			System.out.println();
			System.out.println(end6 - start6 + "MS for Hybrid");
			System.out.println();
			long start7 = System.currentTimeMillis();
			quick.sort(test);
			long end7 = System.currentTimeMillis();
			System.out.println();
			System.out.println(end7 - start7 + "MS for Quick");
			break;
		}
		sc.close();
	}
}
