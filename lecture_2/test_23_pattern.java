package lecture_2;
import java.util.*;
public class test_23_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int space=2*n-3;
		int star=1;
		while(row<=n) {
			int a=1;
			int i=1;
			while(i<=star) {
				System.out.print(a+"\t");
				i++;
				a++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			int k=1;
					if(row==n)
						k=2;
			a--;
			while(k<=star) {
				System.out.print(a+"\t");
				k++;
				a--;
			}
	    System.out.println();
		row++;
		star++;
		space-=2;
}
}
}

