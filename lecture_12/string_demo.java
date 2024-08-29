package lecture_12;

public class string_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		String str4=new String("Hello");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		System.out.println(str1.equals(str3));
		String s1="bye";
		//String s=str1+s1;
		String s=str1.concat(s1);
		System.out.println(s);
	}

}
