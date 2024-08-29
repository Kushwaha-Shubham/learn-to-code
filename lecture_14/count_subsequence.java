package lecture_14;

public class count_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		PrintPath(0, n, "");
	}

	public static void PrintPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.print(ans + " ");
			return;
		}
		if (curr > end)
			return;
		for (int dice = 1; dice <= 3; dice++)
			PrintPath(curr + dice, end, ans + dice);
	}

}
