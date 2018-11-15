package no.hvl.dat102;

public enum Sjanger {
	POP(1), ROCK(2), OPERA(3), KLASSISK(4);
	
	private int nr;

	private Sjanger(int n) { // Konstruktør
		this.nr = n;
	}

	public int getNr() {
		return nr;
	}
	
	public static Sjanger finnSjanger(String navn) {
		Sjanger sjanger = null; 
		for(Sjanger sjangerNavn : Sjanger.values() ) {
			if(sjangerNavn.toString().equals(navn.toUpperCase())) {
				sjanger = sjangerNavn;
			}
		}
		return sjanger;
	}
	
}
