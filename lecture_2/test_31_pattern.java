package lecture_2;
import java.util.*;
public class test_31_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n/2+1;
		int row=1;
		int space=n-1;
		int star=1;
		int sp=-1;
		int a=1;
		while(row<=x) {
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
			i=0;
			while(i<sp) {
				System.out.print("  ");
				i++;
			}
			a++;
			if(row!=1) {
			j=1;
			while(j<=star) {
				System.out.print(a+" ");
				j++;
				a++;
			}
			a--;
			}
			System.out.println();
			row++;
			space-=2;
			sp+=2;
			star++;
			a++;
		}
		row=2;
		space+=4;
		sp-=4;
		star=x-1;
		a=x-1;
		while(row<=x) {
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
			i=1;
			while(i<=sp) {
				System.out.print("  ");
				i++;
			}
			a++;
			if(row!=x) {
			j=1;
			while(j<=star) {
				System.out.print(a+" ");
				j++;
				a++;
			}
			a--;
			}
			System.out.println();
			row++;
			space+=2;
			sp-=2;
			star--;
			a--;
		}
	}

}
