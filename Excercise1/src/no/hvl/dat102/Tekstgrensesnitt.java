package no.hvl.dat102;

import java.util.Scanner;

public class Tekstgrensesnitt {
	Scanner sc = new Scanner(System.in);
	// lese opplysningene om en CD fra tastatur
	 public CD lesCD() {
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn CD-nummer");
		int cdNr = sc.nextInt();
		sc.nextLine();
		System.out.println("Skriv inn artist");
		String artist = sc.nextLine();
		System.out.println("Skriv inn tittel");
		String tittel = sc.nextLine();
		System.out.println("Skriv inn årstall");
		int år = sc.nextInt();
		sc.nextLine();
		System.out.println("Skriv inn sjanger");
		Sjanger sjanger = Sjanger.finnSjanger(sc.nextLine());
		System.out.println("Skriv inn plateselskap");
		String plateselskap = sc.nextLine();	
		
		return (new CD(
				cdNr, 
				artist, 
				tittel, 
				år, 
				plateselskap,
				sjanger));
	 }
	 
	// vise en CD med alle opplysninger på skjerm (husk tekst for sjanger)
	 public void visCD(CD cd) {
		 System.out.println(cd.toString());
	 }
	 
	// Skrive ut alle CD-er med en spesiell delstreng i tittelen
	 public void skrivUtCdDelstrengITittel(CDarkivADT cda, String delstreng) {
		 CD[] delstrengTittel = cda.sokTittel(delstreng);
		 for(int i = 0; i < delstrengTittel.length; i++) {
			 System.out.println(delstrengTittel[i].getCD_navn());
		 }
	 }
	 
	// Skriver ut alle CD-er av en artist / en gruppe
	 public void skrivUtCdArtist(CDarkivADT cda, String delstreng) {
		 CD[] delstrengArtist = cda.sokTittel(delstreng);
		 for(int i = 0; i < delstrengArtist.length; i++) {
			 System.out.println(delstrengArtist[i].getArtist());
		 }
	 }
	 
	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt
	// og hvor mange det er i hver sjanger
	 public void skrivUtStatistikk(CDarkivADT cda){
		 System.out.println("Antall CD'er per sjanger");
		 for(Sjanger s : Sjanger.values()) {
			 System.out.println(s.toString() + ": " + cda.hentAntall(s));
		 }
	 }
	//… Ev. andre metoder
}
