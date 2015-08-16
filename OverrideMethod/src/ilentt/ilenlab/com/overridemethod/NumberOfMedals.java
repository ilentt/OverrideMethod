package ilentt.ilenlab.com.overridemethod;

public class NumberOfMedals {

	// number of gold
	private int iGold;
	// number of silver
	private int iSilver;
	// number if bronze
	private int iBronze;
	
	public NumberOfMedals(int iGold, int iSilver, int iBronze) {
		this.iGold = iGold;
		this.iSilver = iSilver;
		this.iBronze = iBronze;
	}
	
	public int getTotalGold() {
		return iGold;
	}
	
	public int getTotalSilver() {
		return iSilver;
	}
	
	public int getTotalBronze() {
		return iBronze;
	}
	
	// override equals(Object) of class
	@Override
	public boolean equals(Object other) {
		
		// return false if object is null
		if(other == null)
			return false;
		
		// return false if object is not NumberOfMedals
		if(!(other instanceof NumberOfMedals))
			return false;
		
		NumberOfMedals otherNoM = (NumberOfMedals)other;
		// if number of gold, silver and bronze are equals return true else return false
		if(this.iGold == otherNoM.iGold &&
				this.iSilver == otherNoM.iSilver &&
				this.iBronze == otherNoM.iBronze)
			return true;
		return false;
	}

}
