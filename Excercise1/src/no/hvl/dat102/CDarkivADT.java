package no.hvl.dat102;

public interface CDarkivADT {
	
	/**
	 * 
	 * @return Returnere en tabell av CD-er
	 */
	public CD[] hentCdTabell();
	
	/**
	 * Legger til en ny CD
	 * @param nyCd
	 */
	public void leggTilCd(CD nyCd);
	/**
	 * Sletter en CD hvis den fins
	 * @param cdNr
	 * @return boolsk verdi på om cden er slettet eller ikke
	 */
	public boolean slettCd(int cdNr);
	 /**
	  * Søker og henter CD-er med en gitt delstreng
	  * @param delstreng
	  * @return henter CD-er med en gitt delstreng
	  */
	public CD[] sokTittel(String delstreng);
	 /**
	  * Søker og henter artister med en gitt delstreng
	  * @param delstreng
	  * @return henter artister med en gitt delstreng
	  */
	public CD[] sokArtist(String delstreng);
	 /**
	  * 
	  * @return Henter antall CD-er
	  */
	public int hentAntall();//
	 /**
	  * 
	  * @param sjanger
	  * @return Henter antall CD-er for en gitt sjanger
	  */
	public int hentAntall(Sjanger sjanger);
	 
}
