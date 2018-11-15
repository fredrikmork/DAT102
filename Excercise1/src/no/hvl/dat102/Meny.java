package no.hvl.dat102;

import java.util.Scanner;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private CDarkivADT cda;
	private Fil fl;

	public Meny(CDarkivADT cda) {
		tekstgr = new Tekstgrensesnitt();
		this.cda = cda;
		fl = new Fil();
	}

	public void start() {
		boolean run = true;
		boolean hei = true;
		boolean andy = true;
		Scanner sc = new Scanner(System.in);
		
		
		while (run) {
			System.out.println("1 - Ny CD\n2 - Velg tidligere CD\n3 - Avslutt program");
			int input = Integer.parseInt(sc.nextLine());
			
			
			
			switch(input) {
			
			case 1:
				
				System.out.println("1 - Legg til og vis CD\n2 - Gå tilbake");
				while(hei) {
					input = Integer.parseInt(sc.nextLine());
					String s1 = sc.nextLine();
					switch (input) {
					
					case 1:
						CD cd = tekstgr.lesCD();
						cda.leggTilCd(cd);
						tekstgr.visCD(cd);
						fl.skrivTilFil(cda, s1);
						hei = false;
						break;
					case 2:
						hei = false;
					default:
						break;
					}
				}
				break;
			case 2: 
				System.out.println(
						"1 - Søk etter tittel\n2 - Søk etter artist\n3 - Slett\n4 - Gå tilbake");
				input = Integer.parseInt(sc.nextLine());
				String s = sc.nextLine();
				switch(input) {
				case 1: 
					cda.sokTittel(s);
					break;
				case 2: 
					cda.sokArtist(s);
					break;
				case 3:
					while(andy) {
						System.out.println("Skriv inn cdnummer som skal slettes");
						input = Integer.parseInt(sc.nextLine());
						cda.slettCd(input);
						
					}
					
					break;
				case 4: 
					break;
				}
				break;
			case 3: run = false;	
				break;
			}
			
		}

	}
}
