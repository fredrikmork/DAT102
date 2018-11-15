package no.hib.dat102;

public class Ansatt {

	// Konstanter
	final  static boolean MANN = false;
	final static  boolean KVINNE = true;

	// Objektvariable
	private String fornavn;
	private String etternavn;
	private double timeloenn;
	private boolean kvinne;

	// Konstruktører
	Ansatt() {
	}

	Ansatt(String fornavn, String etternavn, double timeloenn, boolean kjoenn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.timeloenn = timeloenn;
		this.kvinne = kjoenn;
	}

	// get -og setmetoder
	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public double getTimeloenn() {
		return timeloenn;
	}

	public void setTimeloenn(double timeloenn) {
		this.timeloenn = timeloenn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public boolean isKjoenn() {
		return kvinne;
	}

	public void setKjoenn(boolean kjoenn) {
		this.kvinne = kjoenn;
	}

	public static boolean isMann() {
		return MANN;
	}

	public static boolean isKvinne() {
		return KVINNE;
	}

	public String toString() {
		String streng = fornavn + " " + etternavn + " " + timeloenn + " " + kvinne;
		return streng;
	}

}
