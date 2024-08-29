package lecture_10;

public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 128;
		System.out.println(power(k, n));
	}

	public static int power(int x, int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (Math.pow(mid, x) <= n) {
				ans = mid;
				lo = mid + 1;
			} else
				hi = mid - 1;
		}
		return ans;
	}
}
