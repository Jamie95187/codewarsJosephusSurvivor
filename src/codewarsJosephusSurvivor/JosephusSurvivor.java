package codewarsJosephusSurvivor;

import java.util.HashSet;

public class JosephusSurvivor {

	static int lastElement(final int n, final int k) {
		HashSet<Integer> setOfSoldiers = new HashSet<Integer>(n);
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
