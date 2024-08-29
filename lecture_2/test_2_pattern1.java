package lecture_2;
import java.util.*;
public class test_2_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			int j=0;
			while(j<n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
