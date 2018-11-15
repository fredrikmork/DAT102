package no.hvl.dat102.sortering;

import java.util.ArrayList;

public class Selection {
	public static <T extends Comparable<T>> void swap(ArrayList<T> data, int index1, int index2) {
		T temp = data.get(index1);
		data.set(index1, data.get(index2));
		data.set(index2, temp);
		// changes index1 and index2
	}
	public static <T extends Comparable<T>> ArrayList<T> SelectionSort(ArrayList<T> data) {
		ArrayList<T> temp = (ArrayList<T>) data.clone();
		int min;
		for(int index = 0; index < data.size()-1; index++) {
			min = index;
			for(int scanIndex = index + 1; scanIndex < data.size(); scanIndex++) {
				T scan = data.get(scanIndex);
				T mini = data.get(min);
				if(scan.compareTo(mini) < 0){
					min = scanIndex;
				}
			}
			swap(temp, min, index);
		}
		return temp;
	}
}
