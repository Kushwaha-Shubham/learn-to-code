package Lecture_6;

import java.util.*;

public class fah_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minf = sc.nextInt();
		int maxf = sc.nextInt();
		int step = sc.nextInt();
		temperature(minf, maxf, step);

	}

	public static void temperature(int x, int y, int z) {
		while (x <= y) {
			// int temp = ((x - 32) * 5) / 9;
			int temp = (int) ((5.0 / 9) * (x - 32));
			System.out.println(x + "\t" + temp);
			x = x + z;
		}
	}

}
