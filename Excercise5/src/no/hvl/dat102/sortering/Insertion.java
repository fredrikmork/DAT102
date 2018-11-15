package no.hvl.dat102.sortering;

import java.util.ArrayList;

public class Insertion {
	public static <T extends Comparable<T>> void swap(ArrayList<T> data, int index1, int index2) {
		T temp = data.get(index1);
		data.set(index1, data.get(index2));
		data.set(index2, temp);
		// changes index1 and index2
	}
	public static <T extends Comparable<T>> ArrayList<T> InsertionSort(ArrayList<T> data) {
		ArrayList<T> temp = (ArrayList<T>) data.clone();
		for (int index = 1; index < data.size(); index++) {
			T pos2 = temp.get(index);
			T pos1 = temp.get(index - 1);
			int position = index;
			while (pos1.compareTo(pos2) > 0 && position > 1) {
				swap(temp, position, position - 1);
				position--;
				pos1 = temp.get(position - 1);
				pos2 = temp.get(position);
			}
		}
		return temp;
	}
}
