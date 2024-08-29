package lecture_27;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2, 6));
		System.out.println(Add(2, 6, 9));
		System.out.println(Add(2, 6, 9.9));
		System.out.println(Add(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
	}

	public static int Add(int a, int b) {
		return a + b;
	}

	public static int Add(int a, int b, int c) {
		return a + b + c;
	}

	public static int Add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int Add(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
