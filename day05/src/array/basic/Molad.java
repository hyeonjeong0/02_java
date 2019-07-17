package array.basic;

public class Molad {

	public void findMultiple(int x) {
		for (int idx = 1; idx <= 100; idx++) {
			if (idx % x == 0) {
				System.out.printf("%d : %d", x, idx);
			}
		}
	}
}
