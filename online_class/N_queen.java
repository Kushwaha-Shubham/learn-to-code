package online_class;

public class N_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		QueenProblem(board, n, 0);
	}

	public static void QueenProblem(boolean[][] board, int tq, int row) {
		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (Isitsafe(board, row, col) == true) {
				board[row][col] = true;
				QueenProblem(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}
	}

	public static boolean Isitsafe(boolean[][] board, int row, int col) {
		int r = row;
		int c = col;
		while (r >= 0) {
			if (board[r][col] == true)
				return false;
			r--;
			c--;
		}
		r = row;
		int c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true)
				return false;
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		
	}
}
