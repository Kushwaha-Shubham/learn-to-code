package lecture_10;

import java.util.*;

public class calculate_the_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans=0;
		int t = sc.nextInt();
		while (t-- > 0) {
			int[] brr = new int[2 * n];
			for (int i = 0; i < n; i++) {
				brr[i] = brr[n + i] = arr[i];
			}
			int x = sc.nextInt();
			int n1 = n - x;
			arr = calculate_sum(brr, x, n, n1);
		}
		for (int i = 0; i < arr.length; i++)
			ans+=arr[i];
		ans=ans%((int)Math.pow(10, 9)+7);
		System.out.println(ans);
	}

	public static int[] calculate_sum(int[] arr, int x, int n, int n1) {
		int[] sum = new int[n];
		int j = 0;
		for (int i = n1; i < arr.length - x; i++) {
			sum[j] = arr[i] + arr[i + x];
			j++;
		}
		return sum;
	}
}
