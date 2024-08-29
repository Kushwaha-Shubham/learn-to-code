package lecture_21;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p.name);
		System.out.println(p.age);
		Person p1 = new Person("Ramu", 20);
		System.out.println(p1.name);
		System.out.println(p1.age);
	}

}
