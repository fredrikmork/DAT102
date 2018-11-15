package no.hvl.dat102;

public class KlientKø{
	public static void main(String[] args) {
		
		SirkulærKøMedUnntak<Character> tegnKoe = new SirkulærKøMedUnntak<Character>();

		String streng = " Denne køen er en FIFO datastruktur.";
		int lengde = streng.length();

		for (int i = 0; i < lengde; i++) {
			tegnKoe.enqueue(new Character(streng.charAt(i)));
		}
		while (!tegnKoe.erTom()) {
			Character tegn_obj = (Character) tegnKoe.dequeue();
			System.out.print(tegn_obj);
		}

	}

}// class
