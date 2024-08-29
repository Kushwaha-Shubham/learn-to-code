package lecture_10;

import java.util.Scanner;

public class alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int k = sc.nextInt();
			decision(arr, a, k);
		}
	}

	public static void decision(int[] arr, int a, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (a%arr[i] == 0)
				count++;
		}
		System.out.println(count>=k||count==arr.length?"Yes":"No");
	}
}
