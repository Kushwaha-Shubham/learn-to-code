package Lecture_6;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(armstrong(n));
	}

	public static int count_digit(int n) {
		int pow = 0;
		for (int i = n; i > 0; i /= 10)
			pow++;
		return pow;
	}

	public static boolean armstrong(int n) {
		int temp = 0;
		for (int i = n; i > 0; i /= 10)
			temp += Math.pow((i % 10), count_digit(n));
		return (temp == n);
	}
}