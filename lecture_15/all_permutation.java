package lecture_15;

public class all_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		print(s, "");
	}

	public static void print(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans + ", ");
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			String s1 = s.substring(0, i);
			String s2 = s.substring(i + 1);
			print(s1 + s2, ans + s.charAt(i));
		}
	}
}
