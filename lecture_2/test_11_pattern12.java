package lecture_2;

import java.util.Scanner;

public class test_11_pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int i=1;
			while(i<=star) {
				if(i%2!=0)
				System.out.print("*");
				else
					System.out.print("!");
				i++;
			}
			System.out.println();
			row++;
			space--;
			star+=2;
		}

	}

}
