package lecture_2;
import java.util.*;
public class test_28_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int sp=n-2;
		while(row<=n) {
			if(row==1) {
				int j=1;
				while(j<=space) {
					System.out.print(" ");
					j++;
				}
				int i=1;
				while(i<=n) {
					System.out.print("*");
					i++;
				}
			}
			else if(row==n) {
				int i=1;
				while(i<=n) {
					System.out.print("*");
					i++;
				}
			}
				else {
					int i=1;
					while(i<=space) {
						System.out.print(" ");
						i++;
				}
					System.out.print("*");
					i=1;
					while(i<=sp) {
						System.out.print(" ");
						i++;
					}
					System.out.print("*");
			}
			System.out.println();
			row++;
			space--;
		}
	}

}
