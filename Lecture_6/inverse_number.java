package Lecture_6;

import java.util.*;

public class inverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(inverse(n));

	}

	public static int inverse(int n) {
		int inv = 0;
		int a = 1;
		for (; n > 0; n /= 10) {
			inv = inv + a * (int) (Math.pow(10, (n%10) - 1));
			a++;
		}
		return inv;
	}

}
