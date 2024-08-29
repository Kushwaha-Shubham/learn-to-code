package lecture_2;
import java.util.*;
public class test_30_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=2*n-1;
		int row=0;
		int a;
		while(row<=n) {
			int i=1;
			a=n;
			while(i<=star) {
				System.out.print(a+" ");
				i++;
				a--;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			i=1;
			a++;
			if(row==n) {
				i=2;
				a++;
			}
			while(i<=star) {
				System.out.print(a+" ");
				i++;
				a++;
			}
			System.out.println();
			row++;
			star++;
			space-=2;
		}
		row=1;
		space=1;
		star=n;
		while(row<=n) {
			int i=1;
			a=n;
			while(i<=star) {
				System.out.print(a+" ");
				i++;
				a--;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			i=1;
			a++;
			while(i<=star) {
				System.out.print(a+" ");
				i++;
				a++;
			}
			System.out.println();
			space+=2;
			star--;
			row++;
		}
	}

}
