package lecture_18;

import java.util.*;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] arr = new char[m][n];
		for (int i = 0; i < arr.length; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++)
				arr[i][j] = s.charAt(j);
		}
		int[][] ans = new int[m][n];
		ratinmaze(arr, 0, 0, ans);
		if (flag == false)
			System.out.println("No Path Found");
	}

	static boolean flag = false;

	public static void ratinmaze(char[][] arr, int cr, int cc, int[][] ans) {
		if (cr == arr.length - 1 && cc == arr[0].length - 1 && arr[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			Display(ans);
			flag = true;
			return;
		}
		if (cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length || arr[cr][cc] == 'X')
			return;
		arr[cr][cc] = 'X';
		ans[cr][cc] = 1;
		ratinmaze(arr, cr - 1, cc, ans);// up
		ratinmaze(arr, cr + 1, cc, ans);// down
		ratinmaze(arr, cr, cc + 1, ans);// right
		ratinmaze(arr, cr, cc - 1, ans);// left
		arr[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++)
				System.out.print(ans[i][j]);
			System.out.println();
		}
	}
}
