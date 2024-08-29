package Lecture_6;

import java.util.Scanner;

public class print_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		armstrong(x, y);

	}

	public static int count_digit(int n) {
		int pow = 0;
		for (int i = n; i > 0; i /= 10)
			pow++;
		return pow;
	}

	public static void armstrong(int x, int y) {
		for (; x < y; x++) {
			int pow = 0;
			for (int i = x; i > 0; i /= 10)
				pow++;
			int temp = 0;
			for (int i = x; i > 0; i /= 10)
				temp += Math.pow((i % 10), pow);
			if (temp == x)
				System.out.println(temp);
		}
	}
}
