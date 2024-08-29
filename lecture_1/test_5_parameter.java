package lecture_1;

public class test_5_parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=4, c=5;
		int p=a+b+c;
		System.out.println(p);
		int s=p/2;
		double ans=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(ans);
		}

}
