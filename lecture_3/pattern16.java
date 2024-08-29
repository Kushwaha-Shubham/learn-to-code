package lecture_3;
import java.util.*;
public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=4;
		int star=5;
		while(row<=2*n-1) {
			//space
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			//mirror
			if(row<n) {
				star--;
				space--;
			}
			else {
				star++;
				space++;
			}
			row++;
			System.out.println();
			
	}
	}
}

