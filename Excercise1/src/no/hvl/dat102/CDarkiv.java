package no.hvl.dat102;

public class CDarkiv implements CDarkivADT{
	
	private CD[] CDsamling; 
	private int antall = 0;
	private final int STARTSTORRELSE = 10;
	
	public CDarkiv() {
		CDsamling = new CD[STARTSTORRELSE];
		antall = 0;
	}
	
	// Returnere en tabell av CD-er
	@Override
	public CD[] hentCdTabell() {
		return CDsamling;
	 }
	
	// Legger til en ny CD
	@Override
	public void leggTilCd(CD nyCD) {
		if(antall == CDsamling.length) {
			utvidKapasitet();
		}
		CDsamling[antall] = nyCD;
		antall++;
	}
	

	// Sletter en CD hvis den fins
	@Override
	public boolean slettCd(int cdNr) {
		boolean eksisterer = false;
		for(int i = 0; i < CDsamling.length && !eksisterer; i++) {
			if(CDsamling[i].getCD_nummer() == cdNr) {
				CDsamling[cdNr] = CDsamling[antall-1];
				CDsamling[antall-1] = null;
				antall--;
				eksisterer = true;
			}
		}
		return eksisterer;
	}

	 // Søker og henter CD-er med en gitt delstreng
	@Override
	public CD[] sokTittel(String delstreng) {
		CD[] midlertidig = new CD[CDsamling.length];
		int antall = 0;
		for(int i = 0; i < antall; i++) {
			if(CDsamling[i].getCD_navn().contains(delstreng)) {
				midlertidig[antall] = CDsamling[i];
				antall++;
			}
		}
		return midlertidig;
	}
	
	 // Søker og henter artister med en gitt delstreng
	@Override
	public CD[] sokArtist(String delstreng) {
		CD[] midlertidig = new CD[CDsamling.length];
		int antall = 0;
		for(int i = 0; i < antall; i++) {
			if(CDsamling[i].getArtist().contains(delstreng)) {
				midlertidig[antall] = CDsamling[i];
				antall++;
			}
		}
		return midlertidig;
	}
	
	 // Henter antall CD-er
	@Override
	public int hentAntall() {
		return antall;
	}
	
	 // Henter antall CD-er for en gitt sjanger
	@Override
	public int hentAntall(Sjanger sjanger) {
		int antallCDSjanger = 0;
		for(int i = 0; i < antall; i++) {
			if(CDsamling[i].getSjanger() == sjanger) {
				antallCDSjanger++;
			}
		}
		return antallCDSjanger;
	}
	
	private void utvidKapasitet() { //utvider 30%
		CD[] hjelpetabell = new CD[(int)Math.ceil(1.3 * CDsamling.length)];
		for (int i = 0; i < antall; i++){
			hjelpetabell[i] = CDsamling[i];
		}
		CDsamling = hjelpetabell;
	}
	
}
