package lecture_3;
import java.util.Scanner;
public class pattern_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		int num=1;
		while(row<=2*n-1) {
			int j=1;
			while(j<=space) {
				System.out.print(" \t");
				j++;
			}
			int i=1;
			while(i<=star) {
				System.out.print(num+"\t");
				if(i<=star/2)
					num++;
				else
					num--;
				i++;
			}
			row++;
			if(row<=n) {
				star+=2;
				space--;
				num=row;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();
		}
	}

}
