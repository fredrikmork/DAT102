package no.hvl.dat102;

public class NumberSequence {
	
	public static void main(String[] args) { //Main-program
		System.out.println(SumNaturalNumbers(100)); 
		System.out.println(SumNaturalNumbers2(10));
	}
	
	public static int SumNaturalNumbers(int n) {
		int sum = 0;
		if(n == 1) {
			return 1; //BaseCase
		} else {
			sum += n + SumNaturalNumbers(n-1); //Recursive call
		}
		return sum;
	}
	
	public static int SumNaturalNumbers2(int n) {
		int sum = 0;
		if( n == 0) { //BaseCase
			return 2;
		} else if (n == 1) {
			return 5;
		} else {
			sum = 5 * SumNaturalNumbers2(n-1) - 6 * SumNaturalNumbers2(n-2) + 2; //recursive call 
		}
		return sum;
	}
}
