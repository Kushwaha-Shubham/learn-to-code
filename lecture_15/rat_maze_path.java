package lecture_15;

public class rat_maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 3;
		printpath(0, 0, n - 1, m - 1, "");
	}

	public static void printpath(int cr, int cc, int er, int ec, String ans) {
		// +ve base case
		if (cr == er && cc == ec) {
			System.out.println(ans+" ");
			return;
		}
		// -ve base case
		if (cr > er || cc > ec)
			return;
		printpath(cr, cc + 1, ec, er, ans + "H");// Horizontal move
		printpath(cr + 1, cc, ec, er, ans + "V");// Vertical move
	}
}
