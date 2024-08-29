package lecture_4;
import java.util.*;
public class Fibonacci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0,y=1;
		System.out.println(x);
		int i=1;
		while(i<n) {
			int j=0;
			while(j<=i) {
				System.out.print(y+"\t");
				y=x+y;
				x=y-x;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
