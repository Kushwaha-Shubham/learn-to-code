package lecture_10;

import java.util.Scanner;

public class inverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		inverse(arr);
	}

	public static void inverse(int[] arr) {
		int[] inv = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			inv[arr[i]] = i;
		}
		for (int i = 0; i < inv.length; i++)
			System.out.print(inv[i] + " ");
	}
}
