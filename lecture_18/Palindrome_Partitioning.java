package lecture_18;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(ques, "", ll, ans);
		System.out.println(ans);
	}

	public static void Partitioning(String ques, String ans, List<String> ll, List<List<String>> ans1) {
		if (ques.length() == 0) {
			ans1.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s1 = ques.substring(0, i);
			if (palindrome(s1)) {
				ll.add(s1);
				Partitioning(ques.substring(i), ans + s1 + "|", ll, ans1);
				ll.remove(ll.size() - 1);
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
