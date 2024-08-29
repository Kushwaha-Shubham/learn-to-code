package lecture_10;

import java.util.*;

public class target_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int target = sc.nextInt();
		sum_pair(arr, target);
	}

	public static void sum_pair(int[] arr, int item) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == item)
					System.out.println(arr[i] + " and " + arr[j]);
			}
		}
	}
}
