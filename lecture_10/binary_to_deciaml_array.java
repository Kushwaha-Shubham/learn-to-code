package lecture_10;

import java.util.Scanner;

public class binary_to_deciaml_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		binary_decimal(arr);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
	public static int[] binary_decimal(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			int sum=0;
			int j=0;
			while(n>0) {
				int temp=n%10;
				sum+=temp*Math.pow(2, j);
				j++;
				n/=10;
			}
			arr[i]=sum;
		}
		return arr;
	}

}
