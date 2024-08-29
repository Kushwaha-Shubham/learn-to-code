package lecture_10;

import java.util.*;

public class arrays_target_sum_triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int target = sc.nextInt();
		triplets_sum(arr, target);
	}

	public static void triplets_sum(int[] arr, int item) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == item)
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
				}
			}
		}
	}
}
