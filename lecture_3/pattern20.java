package lecture_3;
import java.util.*;
public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space1=n/2+1;
		int space2=-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<space1) {
				System.out.print(" ");
				i++;
			}
			System.out.print("*");
			int j=1;
			while(j<=space2) {
				System.out.print(" ");
				j++;
			}
			if(row<n/2) {
				space1--;
				space2+=2;
				System.out.print("*");
			}
			else {
				space1++;
				space2-=2;
				System.out.print("*");
			}
			row++;
			System.out.println();
		}
	}

}
