package no.hvl.dat102;

import no.hvl.dat102.EmptyCollectionException;

public class SirkulærKøMedUnntak<T> implements KøADT<T>{
	private final static int START_KAPASITET = 100;
	private int front, bak, antall;
	private T[] kø;
	//Oppretter en tom kø med en speisfisert kapasitet.
	public SirkulærKøMedUnntak(int innledendeKapasitet) {
		front = bak = antall = 0;
		kø = (T[]) (new Object[innledendeKapasitet]);
	}
	//Oppretter en tom kø.
	public SirkulærKøMedUnntak() {
		this(START_KAPASITET);
	}
	//Legger til det spesifiserte elementet på toppen av køen, utvider
	//kapasitetet til køen hvis nødvendig.
	public void enqueue(T element) {
		if(antall() == kø.length) {
			utvid();
		}
		kø[bak] = element;
		bak = (bak+1) % kø.length;
		antall++;
	}
//	Fjerner toppelementet og returnerer en referanse til den. Hvis køen
//	er tom fra før, så returneres null
	public T dequeue() throws EmptyCollectionException{
		if (erTom()) {
			throw new EmptyCollectionException("Kø");
		}
		T result = kø[front];
		kø[front] = null;
		front = (front+1) % kø.length;
		
		antall--;

		return result;
	}
	//Returnerer toppelementet uten å fjerne det. Hvis køen er tom fra
	//før, så returneres null
	public T første() throws EmptyCollectionException{
		if (erTom())
			throw new EmptyCollectionException("Kø");

		return kø[front];
	}
	//Returnerer sann hvis køen er tom og usann ellers.
	public boolean erTom() {
		return (antall == 0);
	}
	//Returnerer antall elementer.
	public int antall() {
		return antall;
	}
	//Oppretter en ny tabell for å lagre innholdet.
	private void utvid() {
		T[] større = (T[]) (new Object[kø.length * 2]);

		for (int indeks = 0; indeks < antall; indeks++) {
			større[indeks] = kø[front];
			front = (front + 1) % kø.length;
		}
		front = 0;
		bak = antall;
		kø = større;
	}

}
