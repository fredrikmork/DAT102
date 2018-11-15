package no.hvl.dat102;

import no.hvl.dat102.EmptyCollectionException;

public interface KøADT<Character> {
	public void enqueue (Character element);
	public Character dequeue() throws EmptyCollectionException;
	public Character første() throws EmptyCollectionException;
	public boolean erTom();
	public int antall();

}
