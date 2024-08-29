package lecture_27;

public class Client {
	public static void main(String[] args) {
		// Case-1
		// P obj=new P();
		// Case-2
		// P obj = new C();
		// System.out.println(obj.d);
		// System.out.println(obj.d1);
		// System.out.println(((C) (obj)).d2);
		// System.out.println(((C) (obj)).d);
		// obj.fun();
		// obj.fun1();
		// ((C) (obj)).fun2();
		// Case-3
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P) (obj)).d);
		obj.fun();
		obj.fun1();
		obj.fun2();
		P obj1=new P();
	}
}
