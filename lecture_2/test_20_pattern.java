package lecture_2;

import java.util.*;
public class test_20_pattern {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,a=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                if(j==1 || j==i)
                System.out.print(a+"\t");
                else
                System.out.print("0\t");
                j++;
            }
            System.out.println();
            i++;
            a++;
        }
    }
}