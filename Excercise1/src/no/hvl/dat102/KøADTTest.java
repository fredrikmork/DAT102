package no.hvl.dat102;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test for køADT.
 * 
 * @author Fredda Fredsen
 */
public class KøADTTest {

	/**
	 * Size of the tested kø.
	 */
	protected static final int SIZE = 10;

	// The kø
	private KøADT<Integer> kø;

	// Test data
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;
	private Integer e5 = 6;

	/**
	 * Get a new kø for each test.
	 */
	@Before
	public final void setup() {
		kø = new SirkulærKøMedUnntak<Integer>(SIZE);
	}

	/**
	 * Test that a new kø is empty.
	 */
	@Test
	public final void newStackIsEmpty() {
		assertTrue(kø.erTom());
	}

	/**
	 * Test on enqueue and dequeue.
	 */
	@Test
	public final void enqueueAnddequeue() {

		kø.enqueue(e0);
		kø.enqueue(e1);
		kø.enqueue(e2);
		kø.enqueue(e3);

		try {
			assertEquals(e0, kø.dequeue());
			assertEquals(e1, kø.dequeue());
			assertEquals(e2, kø.dequeue());
			assertEquals(e3, kø.dequeue());
		} catch (EmptyCollectionException e) {
			fail("dequeue failed unexpectedly " + e.getMessage());
		}
	}

	/**
	 * Test on enqueue and dequeue with duplicated values.
	 */
	@Test
	public final void enqueueAnddequeueWithDuplicates() {

		kø.enqueue(e0);
		kø.enqueue(e1);
		kø.enqueue(e1);
		kø.enqueue(e2);

		try {
			assertEquals(e0, kø.dequeue());
			assertEquals(e1, kø.dequeue());
			assertEquals(e1, kø.dequeue());
			assertEquals(e2, kø.dequeue());
		} catch (EmptyCollectionException e) {
			fail("dequeue failed unexpectedly " + e.getMessage());
		}
	}

	/**
	 * Testing top.
	 */
	@Test
	public final void enqueueDequeueEnqueueEnqueueDequeueFørste() {
		try {
			kø.enqueue(e2);
			kø.dequeue();
			kø.enqueue(e3);
			kø.enqueue(e4);
			kø.dequeue();
			assertEquals(e4, kø.første());

		} catch (EmptyCollectionException e) {
			fail("dequeue or top failed unexpectedly " + e.getMessage());
		}
	}

	/**
	 * Test that a kø with element(s) is not empty.
	 */
	@Test
	public final void isNotEmpty() {
		kø.enqueue(e0);
		assertFalse(kø.erTom());
	}

	/**
	 * Test that a enqueue - dequeue operation on an empty kø gives an empty
	 * kø.
	 */
	@Test
	public final void enqueuedequeueIsEmpty() {
		try {
			kø.enqueue(e0);
			kø.dequeue();
			assertTrue(kø.erTom());
		} catch (EmptyCollectionException e) {
			fail("dequeue failed unexpectedly " + e.getMessage());
		}
	}
	
	
	/**
	 * Trying to dequeue an element from an empty kø, should give an underflow
	 * exception.
	 * 
	 * @throws EmptyCollectionException
	 *             expected exception
	 */
	@Test(expected = EmptyCollectionException.class)
	public final void dequeueFromEmptyIsUnderflowed() throws EmptyCollectionException {
		kø.dequeue();
	}
	
	/**
     * Tester om køen utvider seg riktig. Stabler p� to flere elementer 
     * enn køtabellen har plass til, sjekker om antallet er riktig,
     * tar ut og sjekker f�rste element, tar ut de i "midten",
     * tar ut og sjekker det siste elementet og sjekker til slutt
     * at kø er tom slik det forventes.
     */
	
    @Test
    public final void utviderKoeSeg() {
        kø.enqueue(e1);
        for (int i = 0; i < SIZE; i++) {
            kø.enqueue(e0);
        }
        kø.enqueue(e2);
        assertEquals(SIZE + 2, kø.antall());
        assertEquals(e1, kø.dequeue());
        for (int i = 0; i < SIZE; i++) {
            kø.dequeue();
        }
        assertEquals(e2, kø.dequeue());
        assertTrue(kø.erTom());
    }

}
