package lecture_5;

import java.util.Scanner;
import java.util.*;
public class any_base_to_any_base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0, mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul *= a;
			n /= 10;
		}
		int sum1 = 0;
		mul = 1;
		while (sum > 0) {
			int rem = sum % b;
			sum1 = sum1 + rem * mul;
			mul *= 10;
			sum /= b;
		}
		System.out.println(sum1);
	}

}
