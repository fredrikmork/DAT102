package no.hvl.dat102.sortering;

import java.util.ArrayList;

public class BubbleSort {
	public static <T extends Comparable<T>> void swap(ArrayList<T> data, int index1, int index2) {
		T temp = data.get(index1);
		data.set(index1, data.get(index2));
		data.set(index2, temp);
		// changes index1 and index2
	}
	public static <T extends Comparable<T>> ArrayList<T> BubbleSort(ArrayList<T> data) {
		ArrayList<T> temp = (ArrayList<T>) data.clone();
		for (int j = 1; j < data.size() - 1; j++) {
			boolean swapUsed = false;
			for (int index = 0; index < data.size() - j; index++) {
				T pos1 = temp.get(index);
				T pos2 = temp.get(index + 1);
				if (pos1.compareTo(pos2) > 0) {
					swapUsed = true;
					swap(temp, index, index + 1);
				}
			}
			if (!swapUsed) {

				break;
			}
		}
		return temp;
	}
}
