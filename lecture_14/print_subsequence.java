package lecture_14;

public class print_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		subsequence(ques, "");
	}

	public static void subsequence(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		subsequence(ques.substring(1), ans);
		subsequence(ques.substring(1), ans + ch);
	}
}
