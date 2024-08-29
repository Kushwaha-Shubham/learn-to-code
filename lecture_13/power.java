package lecture_13;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 2;
		System.out.println(pow(a, b));
	}

	public static int pow(int a, int b) {
		if (b == 0)
			return 1;
		int fn = pow(a, b - 1);
		return a * fn;
	}
}
