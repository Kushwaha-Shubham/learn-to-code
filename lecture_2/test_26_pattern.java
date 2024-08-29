package lecture_2;
import java.util.*;
public class test_26_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n/2+1;
		int row=1;
		int space=-1;
		int star=x;
		while(row<=x) {
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int k=1;
					if(row==1)
						k=2;
			while(k<=star) {
				System.out.print("*");
				k++;
			}
	    System.out.println();
		row++;
		star--;
		space+=2;
}
	star=2;
	space-=4;
	row=2;
	while(row<=x) {
		int i=1;
		while(i<=star) {
			System.out.print("*");
			i++;
		}
		int j=1;
		while(j<=space) {
			System.out.print(" ");
			j++;
		}
		int k=1;
		if(row==x)
			k=2;
		while(k<=star) {
			System.out.print("*");
			k++;
		}
		System.out.println();
		row++;
		star++;
		space-=2;
	}
}
}