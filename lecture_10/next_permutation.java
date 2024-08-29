package lecture_10;

import java.util.Scanner;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		permutation(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			for(int k=0;k<n;k++)
				System.out.print(" ");
		}
	}

	public static void permutation(int[] arr) {
		int p = -1;
		//scan from right to left, find the first element that is less than its previous one
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1]) {
				p = i - 1;
				System.out.println(p);
				break;
			}
		}
		if (p == -1) {
			reverse(arr, 0, arr.length-1);
			return;
		}
		// scan from right to left, find the first element that is greater than p
		int q = arr.length - 1;
		for (int i = arr.length - 1; i >= p + 1; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				System.out.println(q);
				break;
			}
		}
		swap(arr, p, q);
		reverse(arr, p + 1, arr.length - 1);
	}

	public static void swap(int[] arr, int p, int q) {
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
}
