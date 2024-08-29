package lecture_17;

import java.util.*;

public class max {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int[] arr = new int[n1];
		int[] brr = new int[n2];
		int[] crr = new int[n3];
		for (int i = 0; i < n1; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < n2; i++)
			brr[i] = sc.nextInt();
		for (int i = 0; i < n3; i++)
			crr[i] = sc.nextInt();
		min(arr, brr, crr);
	}

	public static void min(int[] A, int[] B, int[] C) {
		 int i = A.length - 1;
	       int j = B.length - 1;
	       int k = C.length - 1;
	         
		int minD = Math.abs(Math.max(A[i], Math.max(B[j], C[k])) - Math.min(A[i], Math.min(B[j], C[k])));
		int currD, maxT;
		while (i >= 0 && j >=0 && k >=0) {
			currD = Math.abs(Math.max(A[i], Math.max(B[j], C[k])) - Math.min(A[i], Math.min(B[j], C[k])));
			if (currD < minD)
				minD = currD;
			maxT = Math.max(A[i], Math.max(B[j], C[k]));
			if (A[i] == maxT)
				i--;
			else if (B[j] == maxT)
				j--;
			else
				k--;
		}
		System.out.println(minD);
	}
}