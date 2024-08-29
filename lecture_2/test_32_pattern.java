package lecture_2;
import java.util.*;
public class test_32_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			int num=1;
			int j=0;
			while(j<=i) {
				System.out.print(num+"\t");
				num=num*(i-j)/(j+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
