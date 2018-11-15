package no.hvl.dat102;

import no.hvl.dat102.kjedet.*;

public class CDarkiv2 implements CDarkivADT{
	/*
	 * feltvariabler
	 */
	private LinearNode<CD> start;
	private int antall;
	/*
	 * konstruktør
	 * 
	 */
	public CDarkiv2 () {
		start = null;
		antall = 0;
	}
	@Override
	public CD[] hentCdTabell() {
		CD[] tab = new CD[antall];
		LinearNode <CD> temp = start;
		
		for(int i = 0; i < antall; i++) {
			tab[i] = temp.getElement();
			temp = temp.getNeste();
		}
		return tab;
	}
	@Override
	public void leggTilCd(CD nyCd) {
		LinearNode <CD> temp = new LinearNode<CD>(nyCd);
		temp.setNeste(start);
		start = temp;
		antall++;
	}
	@Override //POP
	public boolean slettCd(int cdNr) {
		if(erTom()) {
			return false;
		} else if(start.getElement().getCD_nummer() == cdNr) {
			start = start.getNeste();
			antall--;
			return true;
		}
		LinearNode<CD> temp = start.getNeste();
		LinearNode<CD> forrige = start;
		boolean slettet = false;
		while((temp != null)&& !slettet) {
			if(temp.getElement().getCD_nummer() == cdNr) {
				forrige.setNeste(temp.getNeste());
				antall--;
				slettet = true;
			} else {
				forrige = temp;
				temp = temp.getNeste();
			}
		}
		return slettet;
	}
	@Override
	public CD[] sokTittel(String delstreng) {
		CD[] tab = new CD[antall];
		int ind = 0;
		LinearNode<CD> temp = start;
		for(int i = 0; i < antall; i++) {
			if(temp.getElement().getCD_navn().contains(delstreng)) {
				tab[ind] = temp.getElement();
				ind++;
			}
			temp = temp.getNeste();
		}
		return tab;
	}
	@Override
	public CD[] sokArtist(String delstreng) {
		CD[] tab = new CD[antall];
		int ind = 0;
		LinearNode<CD> temp = start;
		for(int i = 0; i < antall; i++) {
			if(temp.getElement().getArtist().contains(delstreng)) {
				tab[ind] = temp.getElement();
				ind++;
			}
			temp = temp.getNeste();
		}
		return tab;
	}
	@Override
	public int hentAntall() {
		return antall;
	}
	 @Override
	public int hentAntall(Sjanger sjanger) {
		 LinearNode<CD> temp = start;
		 int antallCDSjanger = 0;
		 for(int i = 0; i < antall; i++) {
			 if(temp.getElement().getSjanger() == sjanger) {
				 antallCDSjanger++;
			 }
			 temp = temp.getNeste();
		 }
			return antallCDSjanger;
	 }

	 public boolean erTom() {
		 return (antall == 0);
	 }
	 
}
