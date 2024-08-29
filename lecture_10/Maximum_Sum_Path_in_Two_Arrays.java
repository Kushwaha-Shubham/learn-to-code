package lecture_10;

import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] arr1 = new int[m];
			int[] arr2 = new int[n];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = sc.nextInt();
			}
			System.out.println(pathsum(arr1, arr2));
		}
	}

	public static int pathsum(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int sum1 = 0;
		int sum2 = 0;
		int ans = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			} else if (arr1[i] > arr2[j]) {
				sum2 += arr2[j];
				j++;
			} else {
				sum1+=arr1[i];
				i++;
				sum2+=arr2[j];
				j++;
				ans = ans + Math.max(sum1, sum2);
				sum1=sum2=0;
			}
		}
		if(i==arr1.length) {
			ans+=sum2;
			for (; j < arr2.length; j++)
				ans+=arr2[j];
			}
		else {
			ans+=sum1;
			for (; i < arr1.length; i++)
				ans+=arr1[i];
			}
		return ans;
	}
}
