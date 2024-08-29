package lecture_4;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		int divisor = sc.nextInt();
		int divident = sc.nextInt();
		int lcm=divisor*divident;
		while(divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		lcm=lcm/divisor;
		System.out.println(lcm);
	}

}
