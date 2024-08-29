package lecture_4;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12345;
		int a=0;
		while(i>0) {
			a=a*10+i%10;
			i=i/10;
		}
		System.out.println(a);
	}

}
