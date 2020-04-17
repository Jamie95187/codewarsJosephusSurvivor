/*
 * This is a solution to the codewars problem:
 * https://www.codewars.com/kata/555624b601231dc7a400017a/train/java
 * Solved using TDD processes. Consult Readme for full details.
 * 
 * @author  Jamie Wong
 * @version 13.0.0
 * @since	17/04/2020
 */


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
	
	@Test
	public void lastElementtest_fourSoldiers_return1() {
		assertEquals(1, JosephusSurvivor.lastElement(4,2));
		assertEquals(1, JosephusSurvivor.lastElement(4,3));
	}
	
	@Test
	public void lastElementtest_sevenSoldiersCycleOf3_return4() {
		assertEquals(4, JosephusSurvivor.lastElement(7,3));
	}

}
