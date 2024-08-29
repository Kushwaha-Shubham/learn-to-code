package lecture_4;

import java.util.*;

public class assignment {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		test(n);
	}

	public static void test(int n) {
		int x, y;
		for (; n > 0; n--) {
			x = sc.nextInt();
			y = sc.nextInt();
			winner(x, y);
		}
	}

	public static void winner(int x, int y) {
		int a = 0, b = 0;
		for (int i = 1; i <= Math.min(x, y) + 1; i++) {
			if (i % 2 != 0)
				a += i;
			else
				b += i;
			if (a > x) {
				System.out.println("Harshit");
				break;
			} else if (b > y) {
				System.out.println("Aayush");
				break;
			}
		}
	}
}