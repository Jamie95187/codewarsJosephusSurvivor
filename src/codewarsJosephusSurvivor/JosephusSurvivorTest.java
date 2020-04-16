package codewarsJosephusSurvivor;

import static org.junit.Assert.*;

import org.junit.Test;

public class JosephusSurvivorTest {

	@Test
	public void lastElementtest_twoSoldiers_return1() {
		assertEquals(1, JosephusSurvivor.lastElement(2,1));
	}

}
