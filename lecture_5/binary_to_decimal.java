package lecture_5;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul *= 2;
			n /= 10;
		}
		System.out.println(sum);
	}

}
