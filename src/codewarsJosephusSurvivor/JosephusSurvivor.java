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
