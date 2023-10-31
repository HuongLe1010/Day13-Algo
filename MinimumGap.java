
public class MinimumGap {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };
		int minGap = findMinGap(arr);
		System.out.println("Minimum gap between identical integers: " + minGap);
	}

	// O(n^2)

	public static int findMinGap(int[] arr) {
		int minGap = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					int currentGap = j - i;
					minGap = Math.min(minGap, currentGap);
				}
			}
		}

		if (minGap == Integer.MAX_VALUE) {
			return -1;
		} else {
			return minGap;
		}

	}
}
