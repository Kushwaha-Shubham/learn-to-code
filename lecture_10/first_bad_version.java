package lecture_10;

public class first_bad_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int bad = 3;
		System.out.println(power(n, bad));
	}

	public static int power(int x, int n) {
		 int lo = 1;
			int hi = n;
			int ans=0;
			while (lo <= hi) {
				int mid = lo + (hi-lo) / 2;
				if (isBadVersion(mid)==true){
					ans=mid;
					hi = mid - 1;
				}
				else
					lo = mid + 1;
			}
			return ans;
	    }
	}
}
