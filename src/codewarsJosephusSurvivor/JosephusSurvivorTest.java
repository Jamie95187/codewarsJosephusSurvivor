package codewarsJosephusSurvivor;

import static org.junit.Assert.*;

import org.junit.Test;

public class JosephusSurvivorTest {

	@Test
	public void lastElementtest_twoSoldiers_return1() {
		assertEquals(2, JosephusSurvivor.lastElement(2,1));
		assertEquals(1, JosephusSurvivor.lastElement(2,2));
	}
	
	@Test
	public void lastElementtest_threeSoldiers_return1() {
		assertEquals(3, JosephusSurvivor.lastElement(3,1));
		assertEquals(3, JosephusSurvivor.lastElement(3,2));

	}
	

}
