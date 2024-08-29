package Lecture_6;

public class fun_demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 7;
		int b = 11;
		System.out.println(add(6, b));
		System.out.println("bye");

	}

	public static int add(int a, int b) {
		int c = a + b;
		System.out.println(sub(a, c));
		return c;
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}
}