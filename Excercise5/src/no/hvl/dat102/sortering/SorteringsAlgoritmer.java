package no.hvl.dat102.sortering;

import java.util.ArrayList;
import java.util.Random;
import no.hvl.dat102.sortering.Insertion;

//Examples with ArrayList
public class SorteringsAlgoritmer {

	// Swap method
	public static <T extends Comparable<T>> void swap(ArrayList<T> data, int index1, int index2) {
		T temp = data.get(index1);
		data.set(index1, data.get(index2));
		data.set(index2, temp);
		// changes index1 and index2
	}

	// Generate random array
	public static ArrayList<Integer> Generate(int length) {
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			int r = random.nextInt(1000);
			list.add(r);
		}
		return list;
	}
	
	static Insertion insertion = new Insertion();
	static BubbleSort bubbleSort = new BubbleSort();
	static Selection selection = new Selection();
	static QuickSort quick = new QuickSort();
	static RadixSort radix = new RadixSort();
	static Merge merge = new Merge();
	static HybridSortering hybrid = new HybridSortering();
	
	public static void main(String[] args) {
		ArrayList<Integer> unsorted = Generate(32000);

		long start = System.currentTimeMillis();
		ArrayList<Integer> sorted = bubbleSort.BubbleSort(unsorted);
		long slutt = System.currentTimeMillis();
		
		long start2 = System.currentTimeMillis();
		ArrayList<Integer> iSorted = insertion.InsertionSort(unsorted);
		long slutt2 = System.currentTimeMillis();
		
		long start3 = System.nanoTime();
		ArrayList<Integer> sSorted = selection.SelectionSort(unsorted);
		long slutt3 = System.nanoTime();
		
		final int SIZE = 64000;
		Random random = new Random();
		int [] test = new int[SIZE];
		for (int i = 0; i < test.length; i++) {
			test[i] = random.nextInt(1000);
		}
		
		long start4 = System.nanoTime() / 1000000;
		quick.sort(test, 0, test.length -1);
		long slutt4 = System.nanoTime() / 1000000;
		
		long start5 = System.nanoTime();
		radix.radixsort(test, test.length);
		long slutt5 = System.nanoTime();
		
		long start6 = System.nanoTime();
		merge.sort(test, 0, test.length - 1);
		long slutt6 = System.nanoTime();
		
		long start7 = System.nanoTime() / 1000000;
//		hybrid.sort(test, 0, test.length);
		long slutt7 = System.nanoTime() / 1000000;

		long insertion = slutt2 - start2;
		long selection = slutt3 - start3;
		long bubbleSort = slutt - start;
		long quick = slutt4 - start4;
		long radix = slutt5 - start5;
		long merge = slutt6 - start6;
		long hybrid = slutt7 - start7;
		
		System.out.println("Insertion: " + insertion);
//		System.out.println("Selection: " + selection);
//		System.out.println("Bubble: " + bubbleSort);
//		System.out.println("Quick: " + quick);
//		System.out.println("Radix: " + radix);
//		System.out.println("Merge: " + merge);
//		System.out.println("\nQuick: " + quick + " Hybrid: " + hybrid + "\n");
//		for(int i = 0; i < test.length; i++) {
//			System.out.print(test[i] + " ");
//		}
		
	}
}
