package no.hvl.dat102;

public class CDarkivKlient {
	 public static void main(String[] args){
		 //… meny
		 CDarkivADT cda = new CDarkiv2();
		// Her konverteres automatisk fra
		 // obj.-ref til interface-ref.
		 
		//CDArkivADT cda = new CDArkiv2();
		// Bytter setningen over med denne i neste øving
		// der du skal bruke lenket/kjedet implementasjon
		 Meny meny = new Meny(cda);
		 meny.start();
		 
		 
	 }
}
