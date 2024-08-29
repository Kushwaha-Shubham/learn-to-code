package lecture_10;

public class max_circular_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {
		int n = arr.length;
		int ans = Integer.MIN_VALUE;
		int[] b = new int[(2 * n)];
		for (int i = 0; i < n; i++)
			b[i] = b[n + i] = arr[i];
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n + i; j++) {
				sum += b[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}

	public static int max1(int[] arr) {
		int n = arr.length;
		int ans = Integer.MIN_VALUE;
		int[] b = new int[(2 * n)];
		for (int i = 0; i < n; i++)
			b[i] = b[n + i] = arr[i];
		int sum = 0;
		for (int i = 0; i < b.length-n; i++) {
			sum += b[i];
			ans = Math.max(ans, sum);
			if (sum < 0)
				sum = 0;
			n--;
		}
		return ans;
	}
}
