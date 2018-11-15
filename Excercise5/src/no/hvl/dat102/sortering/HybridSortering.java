package no.hvl.dat102.sortering;

public class HybridSortering {
	private int input[];
	private int length;
	private final int MIN = 80;

	public void sort(int[] numbers, int start, int slutt) {
//		if (numbers == null || numbers.length == 0) {
//			return;
//		}
//		this.input = numbers;
//		length = numbers.length;


		if((slutt - start) < 9) {
			this.insertionSort(numbers, start, slutt + 1);
		} else {
			this.sort(numbers, start, this.quickSort(numbers, start, slutt) - 1);
			this.sort(numbers, this.quickSort(numbers, start, slutt) + 1, slutt);
		}
	}

	private int quickSort(int[] liste, int low, int high) {
		int i = low;
		int j = high;
		int pivot = liste[low];
			while (i < j) {
				if (liste[i] < pivot) {
					i++;
				}
				if (liste[j] > pivot) {
					j--;
				}
				if (i <= j) {
					swap(i, j);
					i++;
					j--;
				}
				int tmp = liste[i];
				liste[i] = liste[j];
				liste[j] = tmp;
			}
			
			i++;
		return i;
	}

	private void swap(int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	public void insertionSort(int[] input, int start, int slutt) {
		int temp;
		for (int i = start + 1; i < slutt; i++) {
			int val = input[i];
			int j = i - 1;
			while(j >= 0 && val < input[j]) {
				input[j + 1] = input[j];
				j--;
			}
			input[j + 1] = val;
		}
	}
}
