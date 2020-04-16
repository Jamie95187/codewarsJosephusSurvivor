package codewarsJosephusSurvivor;

import java.util.TreeSet;

public class JosephusSurvivor {

	static int lastElement(final int n, final int k) {
		TreeSet<Integer> setOfSoldiers = new TreeSet<Integer>();
//		if(k == 1) {
//			return n;
//		}
		for(int i = 1; i <= n; i++) {
			setOfSoldiers.add(i);
		}
		for(int i = 1; i < n; i++) {
			if((i * k) % n == 0) {
				setOfSoldiers.remove(n);
			} else {
				setOfSoldiers.remove((i * k) % n);
			}
		}
		int lastSoldier = 0;
		for(Integer soldier : setOfSoldiers) {
			lastSoldier = soldier;
		}
		return lastSoldier;
	}
	
}
