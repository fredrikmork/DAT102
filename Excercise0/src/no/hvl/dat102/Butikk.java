package no.hvl.dat102;
import static javax.swing.JOptionPane.*;

public class Butikk {
	private String navn;
	private Vare [] varetab;
	private int [] lagertab;
	private int antallVarer;
	
	public Butikk (String navn, int storrelse) {
		antallVarer = 0;
		this.navn = navn;
		varetab = new Vare[storrelse];
		lagertab = new int[storrelse];
	}
	
	public int finnVare(int varenr) {
		boolean funnet = false;
		int i = 0;
		while(!funnet && (i < antallVarer)) {
			if(varenr == varetab[i].getVarenummer()) {
				funnet = true;
			}else 
			i++;
		}
		if(funnet) {
			return i;
		}
		return -1;
	}
	
	public boolean erLedigPlass() {
		if(antallVarer < varetab.length) {
			return true;
		}
		return false;
	}
	
	public void leggInnNyVare(int varenr) {
		Vare v1 = new Vare(varenr);
		v1.lesVare(1);
		if(erLedigPlass() && (finnVare(varenr) < 0)) {
			varetab[antallVarer++] = v1;
			showMessageDialog(null, "Varen er lagt til");
		} else {
			showMessageDialog(null, "Varen finnes fra før av, eller så er det ikke ledig plass");
		}
	}
	
	public void slettVare(int varenr) {
		int indeks = finnVare(varenr);
		if(indeks >= 0) {
			varetab[indeks] = varetab[antallVarer-1];
			lagertab[indeks] = lagertab[antallVarer-1];
			varetab[antallVarer-1] = null;
			lagertab[antallVarer-1] = 0;
			antallVarer--;
		}
	}
	
	public void detaljSalg (int varenr) {
		int indeks = finnVare(varenr);
		if(indeks == -1) {
			showMessageDialog(null, "Varen finnes ikke");
		} else if(lagertab[indeks] == 0){
			showMessageDialog(null, "Lager er tomt");
		} else {
			lagertab[indeks] -= 1;
		}
	}
	
	public void grossInnkjøp(int varenr, int tall) {
		int indeks = finnVare(varenr);
		if(tall < 0) {
			showMessageDialog(null, "Antall er under null");
		} else if(indeks == -1) {
			showMessageDialog(null, "Varen finnes ikke i varelageret");
		} else {
			lagertab[indeks] += tall;
		}
	}
	
	public double salgsverdi() {
		double sum = 0.0;
		for (int i = 0; i < antallVarer; i++) {
			sum += varetab[i].getPris() * lagertab[i];
		}
		return sum;
	}
	
}
