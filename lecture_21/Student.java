package lecture_21;

public class Student {
	int age;
	String name;
	static int count;

	public void Intro_yourSelf() {
		System.out.println("My name is " + name + " and age is " + age);
	}

	public static void fun(String name) {
		System.out.println(name + " Say Hey " + name);
	}
	static {
		System.out.println("Iam in static");
	}
}
