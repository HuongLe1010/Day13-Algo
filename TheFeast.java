
public class TheFeast {
	public static void main(String[] args) {
		int t = 3;
		int[] nValues = { 10, 12, 6 };
		int[] cValues = { 2, 4, 2 };
		int[] mValues = { 5, 4, 2 };

		for (int i = 0; i < t; i++) {
			int result = theFeast(nValues[i], cValues[i], mValues[i]);
			System.out.println("Test case " + (i + 1) + ":" + result + " bars");
		}
	}

	// O(log(n))

	public static int theFeast(int n, int c, int m) {
		int chocEaten = n / c;
		int wrappers = chocEaten;

		while (wrappers >= m) {
			int newChoc = wrappers / m;
			chocEaten += newChoc;
			wrappers = newChoc + (wrappers % m);
		}

		return chocEaten;
	}

}
