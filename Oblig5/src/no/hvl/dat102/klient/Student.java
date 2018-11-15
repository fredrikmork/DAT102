package no.hvl.dat102.klient;

public class Student {
	private int snr;
	private String navn;
	
	public Student(int snr, String navn) {
		this.snr = snr;
		this.navn = navn;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((navn== null)? 0: navn.hashCode());
		result = prime * result + snr;
		return result;
	}
	
	
	public static void main(String[]args) {
		Student a = new Student(10,"Ole");
		Student b = new Student(10, "Ole");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
