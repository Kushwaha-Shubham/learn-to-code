package lecture_11;

import java.util.*;

public class Array_2D_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		// System.out.println(arr);
		// System.out.println(arr[0]);
		// System.out.println(arr[1][2]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				arr[i][j] = sc.nextInt();
		}
		print(arr);
	}

	public static int[][] print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		return arr;
	}
}
