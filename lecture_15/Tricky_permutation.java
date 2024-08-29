package lecture_15;

public class Tricky_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abca";
		print(s, "");
	}

	public static void print(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			boolean val = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(i)) {
					val = true;
					break;
				}
			}
			if (val == false) {
				String s1 = s.substring(0, i);
				String s2 = s.substring(i + 1);
				print(s1 + s2, ans + s.charAt(i));
			}
		}
	}
}
