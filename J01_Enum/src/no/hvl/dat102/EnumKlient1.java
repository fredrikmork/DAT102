package no.hvl.dat102;

public class EnumKlient1 {
	

	public static void main(String[] args) {
		
		Arbeidsdag startdag = Arbeidsdag.MANDAG;
		Arbeidsdag sluttdag = Arbeidsdag.FREDAG;
		
		System.out.println("Arbeidet startet på " + startdag);
		System.out.println("Arbeidet slutter på " + sluttdag);	
		
		//Alt
		System.out.println("Arbeidet startet på " + startdag.toString());
		System.out.println("Arbeidet slutter på " + sluttdag.toString());	
		
		
		System.out.println("Arbeidet startet på " + startdag.name());
		System.out.println("Arbeidet slutter på " + sluttdag.name());	
		
			
	}

}
