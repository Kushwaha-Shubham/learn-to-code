package lecture_2;
import java.util.*;
public class test_29_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0,y=1,z=1;
		System.out.println(x);
		//System.out.print(y);
		int i=1;
		while(i<n) {
			int j=0;
			while(j<=i) {
				System.out.print(z+"\t");
				z=x+y;
				x=y;
				y=z;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
