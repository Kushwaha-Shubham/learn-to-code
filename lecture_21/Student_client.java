package lecture_21;

public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Student s = new Student();
		s.Intro_yourSelf();
		s.name = "Kaju";
		s.age = 18;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Raju";
		s1.age = 25;
		s1.Intro_yourSelf();
		//s1.SayHey("Ramu");
		Student.fun("Ramu");
	}
}
