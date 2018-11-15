package no.hvl.dat102;

public class CD {
	
	private int 		CD_nummer;
	private String 	artist;
	private String 	CD_navn;
	private int 		år;
	private String 	plateselskap;
	private Sjanger 	sjanger;
	
	public CD () { //tom CD
		this(0, "", "", 0, "", null);
	}
	
	public CD (int CD_nummer, String artist, String CD_navn, int år, String plateselskap, Sjanger sjanger) { //ny CD med feltvariabler
		this.artist = artist;
		this.CD_nummer = CD_nummer;
		this.CD_navn = CD_navn;
		this.år = år;
		this.plateselskap = plateselskap;
		this.sjanger = sjanger;
	}
	
	public Sjanger getSjanger() {
		return sjanger;
	}

	public int getCD_nummer() {
		return CD_nummer;
	}

	public String getPlateselskap() {
		return plateselskap;
	}

	public void setPlateselskap(String plateselskap) {
		this.plateselskap = plateselskap;
	}

	public void setCD_nummer(int cD_nummer) {
		CD_nummer = cD_nummer;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCD_navn() {
		return CD_navn;
	}

	public void setCD_navn(String cD_navn) {
		CD_navn = cD_navn;
	}

	public int getÅr() {
		return år;
	}

	public void setÅr(int år) {
		this.år = år;
	}
	
	@Override
	public String toString() {
		return "Artist: " + artist + "\nTittel: " + CD_navn + 
				"\nÅr: " + år + "\nPlateselskap: " + plateselskap + 
				"\nSjanger: " + sjanger +"";
	}
	
	
	
}
