package no.hvl.dat102;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Fil {
	static final String SKILLE = "#"; 	// Eventuelt ha som parameter i
		 						// metodene.
		 						// Lese et CDarkiv fra tekstfil
		 
	public void lesFraFil(CDarkivADT cdarkiv, String filnavn){
		try {
			Scanner sc = new Scanner(new FileReader(filnavn));
			int antall = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < antall; i++) {
				String [] felt = sc.nextLine().split(SKILLE);
				int nummer = Integer.parseInt(felt[0]);
				String artist = felt[1];
				String tittel = felt[2];
				int lansering = Integer.parseInt(felt[3]);
				String selskap = felt[4];
				Sjanger sjanger = Sjanger.finnSjanger(felt[5]);

				cdarkiv.leggTilCd(new CD(nummer, artist, tittel, lansering, selskap, sjanger));
			}
			sc.close();
		} 
		catch(FileNotFoundException e) {
			System.out.println("Finner ikke filen: " + e);
		}
	}
		 
	// Lagre et CDarkiv til tekstfil
	public void skrivTilFil(CDarkivADT cdarkiv, String filnavn){
		try {
			//0 henter antall cd og infoene i cd.
			int antall = cdarkiv.hentAntall();
			CD[]cdTab = cdarkiv.hentCdTabell();
			//1 filewriter
			FileWriter cdFil = new FileWriter(filnavn);
			//2 PrintWriter
			PrintWriter utFil = new PrintWriter(cdFil);
			//3 skriver ut antall cd-info på den første linjen.
			utFil.println(cdarkiv.hentAntall());
			//4 skriv postene felt for felt
			for(int i = 0; i < antall; i++) {
				CD cd = cdTab[i]; //går gjennom alle CD og skriver ut 
				utFil.print(cd.getCD_nummer());
				utFil.print(SKILLE);
				utFil.print(cd.getArtist());
				utFil.print(SKILLE);
				utFil.print(cd.getCD_navn());
				utFil.print(SKILLE);
				utFil.print(cd.getÅr());
				utFil.print(SKILLE);
				utFil.print(cd.getSjanger());
				utFil.print(SKILLE);
				utFil.println(cd.getPlateselskap());	
			}
			utFil.close();
		}
		catch (IOException e){
			System.out.println("Feil ved skriving til fil: " + e);
			System.exit(0);
		}
		
	} 
	
}
