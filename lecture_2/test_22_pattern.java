package lecture_2;

import java.util.Scanner;

public class test_22_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n/2+1;
		int space=x-1;
		int star=1;
		int i=1;
		while(i<=x) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("*\t");
				k++;
			}
			System.out.println();
			i++;
			space--;
			star+=2;
		}
		i--;
		space=1;
		star-=4;
		while(i<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("*\t");
				k++;
			}
			System.out.println();
			space++;
			star-=2;
			i++;
		}

	}
}
