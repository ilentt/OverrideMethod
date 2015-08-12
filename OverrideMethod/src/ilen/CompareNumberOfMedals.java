package ilen;

public class CompareNumberOfMedals {
	
	public CompareNumberOfMedals() {
		// constructor
	}
	
	public boolean compareMedals(NumberOfMedals country1, NumberOfMedals country2) {
		return country1.equals(country2);
	}
	
	public static void main(String[] args) {
		NumberOfMedals vietnam = new NumberOfMedals(45,53,66);
		NumberOfMedals thailand = new NumberOfMedals(43,66,79);
		NumberOfMedals singapore = new NumberOfMedals(43,66,79);
		
		CompareNumberOfMedals compare = new CompareNumberOfMedals();
		System.out.println("Medal of Vietnam equals Thailand ? " + compare.compareMedals(vietnam, thailand));
		System.out.println("Medal of Thailand equals Singapre ? " + compare.compareMedals(thailand, singapore));
	}
}
