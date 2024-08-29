package lecture_10;

import java.util.*;

public class pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++)
				arr[j] = sc.nextInt();
			int m = sc.nextInt();
			roses(arr, m);
			//System.out.println();
		}
	}

	public static void roses(int[] arr, int m) {
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		int a=0,b=0;
		while(i<j) {
			if(arr[i]+arr[j]==m) {
				a=arr[i];
				b=arr[j];
				i++;
				j--;
			}
			else if(arr[i]+arr[j]>m)
				j--;
			else if(arr[i]+arr[j]<m)
				i++;
		}
		System.out.println("Deepak should buy roses whose prices are "+a+" and "+b+".");
	}
}
