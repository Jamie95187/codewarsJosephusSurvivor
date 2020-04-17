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

public class JosephusSurvivor {

	static int lastElement(final int n, final int k) {
		if (k == 1) {
			return n;
		}
		CircularLinkedList soldiers = new CircularLinkedList();
		for (int i = 1; i <= n; i++) {
			soldiers.addNode(i);
		}
		
		// delete all but one soldier
		
		for (int j = 0; j < n - 1; j++) {
			soldiers.deleteNodeInStepOfi(k);
		}
		return soldiers.getHeadValue();
	}
	
}
