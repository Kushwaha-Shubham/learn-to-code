package lecture_2;

import java.util.Scanner;

public class test_27_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int i=1;
		int a=1;
		while(i<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print(a+"\t");
				k++;
				a++;
			}
			k=1;
			a-=2;
			while(k<=star-1) {
				System.out.print(a+"\t");
				k++;
				a--;
			}
			System.out.println();
			i++;
			space--;
			star++;
			a+=2;
		}
		a-=2;
		i=2;
		space=1;
		star-=2;
		while(i<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print(a+"\t");
				k++;
				a++;
			}
			k=1;
			a-=2;
			while(k<=star-1) {
				System.out.print(a+"\t");
				k++;
				a--;
			}
			System.out.println();
			space++;
			star--;
			i++;
		}
	}

}
