package lecture_17;

import java.util.*;
public class leader {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        leader1(arr);
    }
    public static void leader1(int[] arr){
        boolean l=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
            if(arr[i]<arr[j])
            l=true;
            }
            if(l==false)
                System.out.print(arr[i]+" ");
            l=false;
        }
    }
}