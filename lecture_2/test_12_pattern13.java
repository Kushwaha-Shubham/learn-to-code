package lecture_2;
import java.util.*;
public class test_12_pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int j=1;
			while(j<=row) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
		}
		row = n-1;
		while(row>=1) {
			int j=1;
			while(j<=row) {
				System.out.print("* ");
			    j++;
			}
			System.out.println();
			row--;
		}
		

	}

}
