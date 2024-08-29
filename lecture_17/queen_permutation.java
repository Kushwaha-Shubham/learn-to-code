package lecture_17;

public class queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;
		permutation(board, tq, "", 0);
	}

	public static void permutation(boolean[] board, int tq, String ans, int qpsf) { // qpsf- queen place so far
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				permutation(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1);
				board[i] = false; //undo
			}
		}
	}
}
