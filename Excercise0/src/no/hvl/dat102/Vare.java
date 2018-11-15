package no.hvl.dat102;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Vare {
	private int varenummer;
	private String navn;
	private double pris;
	
	public Vare () {
		this(0, "", 0.0);
	}
	
	public Vare(int varenr) {
		varenummer = varenr;
	}
	
	public Vare (int varenummer, String navn, double pris) {
		this.varenummer = varenummer;
		this.navn = navn;
		this.pris = pris;
	}
	
	public void lesVare(int varenummer) {
		boolean lagtTil = false;
		String navn = showInputDialog("Skriv inn varenavn");	
		int pris = 0;
		while (!lagtTil) {
			pris = parseInt(showInputDialog("Skriv inn pris"));
			if(pris < 0) {
				showMessageDialog(null, "Prisen må være høyere enn 0kr");
			} else
			lagtTil = true;
		}
		this.navn = navn;
		this.pris = pris;
	}

	public int getVarenummer() {
		return varenummer;
	}

	public void setVarenummer(int varenummer) {
		this.varenummer = varenummer;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}
	
	
}
