package lecture_12;

public class print_string_lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		substring1(s1);
	}

	public static void substring(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			int a = 1;
			a = a + i;
			for (int j = 0; j < s1.length(); j++) {
				if (a <= s1.length())
					System.out.println(s1.substring(j, a));
				a++;
			}
		}
	}
	public static void substring1(String s1) {
		for(int len=1;len<=s1.length();len++) {
			for(int j=len;j<=s1.length();j++) {
				int i=j-len;
				System.out.println(s1.substring(i,j));
			}
		}
	}
}
