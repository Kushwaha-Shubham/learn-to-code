package Lecture_6;

public class global_variable {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 7;
		int b = 11;
		System.out.println(val);
		System.out.println(add(6, b));
		System.out.println(val);
		System.out.println("bye");

	}

	public static int add(int a, int b) {
		int c = a + b;
		int val=7;
		val=val+5;
		System.out.println(val);
		global_variable.val=global_variable.val+5;
		// System.out.println(sub(a, c));
		return c;
	}
}