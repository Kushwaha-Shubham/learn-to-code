package lecture_17;

public class queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		combination(board, tq, "", 0, 0);
	}

	public static void combination(boolean[] board, int tq, String ans, int qpsf, int idx) { // qpsf- queen place so far
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				combination(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1, i + 1);
				board[i] = false; // undo
			}
		}
	}
}
