package lecture_12;

public class generate_all_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "nitin";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				if (palindrome(s1.substring(i, j)) == true)
					System.out.println(s1.substring(i, j));
			}
		}
	}

	public static boolean palindrome(String s1) {
		int a = 0;
		for (int i = s1.length() - 1; i > a; i--) {
			if (s1.charAt(i) != s1.charAt(a))
				return false;
			a++;
		}
		return true;
	}
}
