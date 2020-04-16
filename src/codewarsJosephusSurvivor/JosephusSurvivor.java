package codewarsJosephusSurvivor;

public class JosephusSurvivor {

	static int lastElement(final int n, final int k) {
		if(k == 1) {
			return n;
		}
		return n % k + 1;
	}
	
}
