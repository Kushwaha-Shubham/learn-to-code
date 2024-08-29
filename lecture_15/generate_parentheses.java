package lecture_15;

import java.util.*;

public class generate_parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		print(n, 0, 0, "", ll);
		System.out.println(ll);
	}

	public static void print(int n, int open, int close, String ans, List<String> ll) {
		if (open == n && close == n) {
			//System.out.print(ans + ",");
			ll.add(ans);
			return;
		}
		if (open < n)
			print(n, open + 1, close, ans + "(", ll);
		if (close < open)
			print(n, open, close + 1, ans + ")", ll);
	}
}
