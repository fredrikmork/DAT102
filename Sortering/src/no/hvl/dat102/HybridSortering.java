package no.hvl.dat102;

public class HybridSortering {
	private int input[];
	private int length;
	private final int MIN = 10;

	public void sort(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return;
		}
		this.input = numbers;
		length = numbers.length;

		quickSort(0, length - 1);
			for(int i = 0; i<numbers.length;i++) {
				System.out.println(numbers[i]);
			}
			System.out.println();
		insertionSort(numbers);
		for(int i = 0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

	private void quickSort(int low, int high) {
		int i = low;
		int j = high;

		int pivot = input[low + (high - low) / 2];
		if (high - low + 1 > MIN) {
			while (i <= j) {

				while (input[i] < pivot) {
					i++;
				}
				while (input[j] > pivot) {
					j--;
				}
				if (i <= j) {
					swap(i, j);
					i++;
					j--;
				}
			}
			if (low < j) {
				quickSort(low, j);
			}
			if (i < high) {
				quickSort(i, high);
			}
		}
	}

	private void swap(int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	public int[] insertionSort(int[] input) {
		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}
}
