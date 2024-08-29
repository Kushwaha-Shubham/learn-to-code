package lecture_16;

public class letter_combinations_of_a_phone_number {
	static String[] code = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "23";
		combination(str, "");
	}

	public static void combination(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		int num = Integer.parseInt(ques.substring(0, 1));
		//char ch = ques.charAt(0);
		//int num = ch - '0';
		String press = code[num];
		for (int i = 0; i < press.length(); i++) {
			combination(ques.substring(1), ans + press.charAt(i));
		}
	}
}
