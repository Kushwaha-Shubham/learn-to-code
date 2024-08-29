package lecture_2;

import java.util.Scanner;

public class test_24_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int star=n+1;
		int space=0;
		int a=n;
		while(row<=n) {
			int i=0;
			while(i<space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(a+" ");
				j++;
				a--;
			}
			j=1;
			a=1;
			while(j<star) {
				System.out.print(a+" ");
				a++;
				j++;
			}
			System.out.println();
			row++;
			star--;
			space++;
			a=n-row;
		}
		row=1;
		space=n-1;
		star=2;
		a=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(a+" ");
				j++;
				a--;
			}
			j=1;
			a=1;
			while(j<star) {
				System.out.print(a+" ");
				a++;
				j++;
			}
			System.out.println();
			row++;
			star++;
			space--;
			a=j;
		}
		
	}

}
