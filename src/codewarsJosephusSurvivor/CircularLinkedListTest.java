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
		cll.addNode(5);
		cll.addNode(7);
		assertFalse(cll.containsNode(2));
		assertFalse(cll.containsNode(3));
	}

	@Test
	public void givenACircularLinkedList_WhenDeletingElements_ThenListDoesNotContainTheseElements() {
		cll.addNode(1);
		cll.addNode(6);
		assertTrue(cll.containsNode(6));
		cll.deleteNode(6);
		assertFalse(cll.containsNode(6));
	}
}
