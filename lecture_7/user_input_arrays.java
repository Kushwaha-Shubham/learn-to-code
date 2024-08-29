package lecture_7;

import java.util.*;

public class user_input_arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		print(arr);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");
	}
}
