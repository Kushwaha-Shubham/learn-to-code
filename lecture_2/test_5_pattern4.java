package lecture_2;
import java.util.*;
public class test_5_pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=n,j,k;
		while(i>0) {
			j=0;
			while(j<i-1) {
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=n-i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i--;
		}
	}

}
