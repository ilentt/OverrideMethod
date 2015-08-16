package ilentt.ilenlab.com.overridemethod;

import org.junit.Test;

public class OverrideMethodTest {

	@Test
	public void testMain() {
		CompareNumberOfMedals.main(new String[] {});
		
	}
	
	@Test
	public void testGetMedal() {
		NumberOfMedals n = new NumberOfMedals(10,20,30);
		n.getTotalGold();
		n.getTotalSilver();
		n.getTotalBronze();
	}
	
	@Test
	public void testEqual() {
		NumberOfMedals n = new NumberOfMedals(10,20,30);
		Object obj = new NumberOfMedals(10,20,30);
		n.equals(obj);
		
		obj = new Object();
		n.equals(obj);
		
		obj = null;
		n.equals(obj);
	}

}
