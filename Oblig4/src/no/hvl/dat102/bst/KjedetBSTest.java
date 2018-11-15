package no.hvl.dat102.bst;

import no.hvl.dat102.adt.*;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class KjedetBSTest {

	private LinkedBST<Integer> bs;
	// Testdata som legges inn i treet
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;
	private Integer e5 = 6;
	private Integer e6 = 7;

	// Data som ikke legges inn i treet
	private Integer e7 = 8;

	/**
	 * Opprett en tomt tre for hver test.
	 * 
	 * @throws Exception
	 *             exception
	 */
	@Before
	public final void setup() throws Exception {
		bs = new LinkedBST<Integer>();
	}

	/**
	 * Tester finn
	 * 
	 */
	@Test
	public final void erElementIBSTre() {
		bs.leggTil(e3);
		bs.leggTil(e2);
		bs.leggTil(e4);
		bs.leggTil(e5);
		bs.leggTil(e0);
		bs.leggTil(e6);
		boolean erIBST = false;
		
		if(bs.finn(e2) != null) {
			erIBST = true;
		}
		if(erIBST) {
			System.out.println(bs.finn(e1));
		} else {
			System.out.println("Elementet er ikke i BST");
		}
		
		/*
		 * Her legger du inn e0...e6 i treet i en vilkårlig rekkefølge. Etterpå sjekker
		 * du om elementene fins og til slutt sjekker du at e7 ikke fins
		 */

	}

	/**
	 * 1. Tester ordning ved å legge til elementer og fjerne minste
	 * 
	 */
	@Test
	public final void erBSTreOrdnet() {
		bs.leggTil(e3);
		bs.leggTil(e2);
		bs.leggTil(e4);
		bs.leggTil(e1);
		bs.leggTil(e5);
		bs.leggTil(e0);
		bs.leggTil(e6);
		
		bs.fjernMin();
		System.out.println(bs.toString());
	}

	/**
	 * 2 Tester ordning ved å bruke en inordeniterator Her studerer du alt om bruk
	 * av inordeniterator.
	 */
	@Test
	public final void erBSTreOrdnet2() {
		bs.leggTil(e3);
		bs.leggTil(e2);
		bs.leggTil(e4);
		bs.leggTil(e1);
		bs.leggTil(e5);
		bs.leggTil(e0);
		bs.leggTil(e6);

		Integer el[] = { e0, e1, e2, e3, e4, e5, e6 };
		int i = 0;
		for (Integer e : bs) {
			assertEquals(el[i], e);
			i++;
		}

	}
	@Test
	public final void finnBST() {
		bs.finn(e0);
		bs.finn(e1);
		bs.finn(e2);
		bs.finn(e3);
		bs.finn(e4);
		bs.finn(e5);
		bs.finn(e6);
		bs.finn(e7);
		
	}

}// class
