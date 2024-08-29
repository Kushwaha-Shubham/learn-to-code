package lecture_10;

import java.util.Scanner;

public class sort_zeros_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sort(arr);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
	}
	public static int[] sort(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				count++;
		}
	    for(int i=0;i<count;i++)
	    	arr[i]=0;
	    for(int i=count;i<arr.length;i++)
	    	arr[i]=1;
	    return arr;
	}
}
