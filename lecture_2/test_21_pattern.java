package lecture_2;
import java.util.Scanner;

public class test_21_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,space=n-1,star=1;
		while(i<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			int a=i;
			int k=1;
			while(k<=i) {
				System.out.print(a+"\t");
				k++;
				a++;
			}
			a-=2;
			int l=1;
			while(l<=i-1) {
				System.out.print(a+"\t");
				a--;
				l++;
			}
			System.out.println();
			i++;
			space--;
			star=star+2;
		}
	}

}
