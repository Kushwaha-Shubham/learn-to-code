package lecture_4;

import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			int j=0;
			int num=1;
			while(j<=i) {
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
