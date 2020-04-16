package codewarsJosephusSurvivor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircularLinkedListTest {

	CircularLinkedList cll;

	@Before
	public void setup() {
		cll = new CircularLinkedList();
	}
	
	@Test
	public void givenACircularLinkedList_WhenAddingElements_ThenListContainsThoseElements() {
		cll.addNode(1);
		cll.addNode(4);
		assertTrue(cll.containsNode(1));
		assertTrue(cll.containsNode(4));
	}
	
	@Test
	public void givenACircularLinkedList_WhenLookingForNonExistingElements_ThenreturnFalse() {
		cll.addNode(1);
		cll.addNode(4);
		assertFalse(cll.containsNode(2));
		assertFalse(cll.containsNode(3));
	}

}
