package no.hvl.dat102;

public class Test {

	public static void main(String[] args) {
		Butikk butikk = new Butikk("Coop", 100);
		butikk.leggInnNyVare(1);
		butikk.leggInnNyVare(2);
		butikk.grossInnkjøp(1, 3);
		butikk.grossInnkjøp(2, 3);
		System.out.println(butikk.salgsverdi());
		butikk.slettVare(1);
		butikk.detaljSalg(2);
		System.out.println(butikk.salgsverdi());
		System.exit(0); //Avslutter programmet
		
	}

}
