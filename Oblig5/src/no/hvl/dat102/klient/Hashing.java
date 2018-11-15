package no.hvl.dat102.klient;

import java.util.*;
import java.util.HashSet;
import java.util.Random;

public class Hashing {

	public static void main(String[] args) {
		
		
		HashSet<Integer>hash = new HashSet<Integer>(100000);
		Integer[] intTab = new Integer[100000];
		Integer tall = 376;
		int tellerHash = 0;
		int tellerBinaer = 0;
		long tidHash;
		long tidBinaer;
		long tidEtterHash;
		long tidEtterBinaer;
		long totalTidHash;
		long totalTidBinaer;
		
		for(int i  = 0; i<100000;i++) {
			tall = (tall + 45713)%1000000;
			intTab[i] = tall;
			hash.add(tall);
		}
		Arrays.sort(intTab);
		
		Integer[]sokTab = new Integer[10000];
		for(int i = 0; i<10000;i++) {
			tall = (tall +66179)%1000000;
			sokTab[i]=tall;
		}
		tidHash = System.currentTimeMillis();
		
		for(int i = 0; i<10000; i++) {
			if(hash.contains(sokTab[i])) {
				tellerHash++;
			}
		}
		tidEtterHash = System.currentTimeMillis();
		
		tidBinaer = System.currentTimeMillis();
		
		for(int i = 0; i<10000;i++) {
			if(Arrays.binarySearch(intTab, sokTab[i])>=0) {
				tellerBinaer++;
			}
		}
		tidEtterBinaer = System.currentTimeMillis();
		
		totalTidHash = tidEtterHash - tidHash;
		totalTidBinaer = tidEtterBinaer - tidBinaer;
		
		System.out.println("Tid for søk i HashSet: " + totalTidHash);
		System.out.println("Antall elementer funnet: " + tellerHash);
		System.out.println("Tid for binaer søk: " + totalTidBinaer);
		System.out.println("Antall elementer funnet: " + tellerBinaer);
	}
}
