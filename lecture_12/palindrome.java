package lecture_12;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="nitin";
		System.out.println(check_palindrome(s1));
	}
	public static boolean check_palindrome(String s1){
		int a=0;
		for(int i=s1.length()-1;i>a;i--) {
			if(s1.charAt(i)!=s1.charAt(a))
				return false;
			a++;
		}
		return true;
	}
}
