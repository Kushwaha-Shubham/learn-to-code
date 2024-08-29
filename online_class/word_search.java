package online_class;

import java.util.Scanner;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word="ABCCED";
		for (int i = 0; i < board[0].length; i++) {
			for(int j=0;j<board[0].length;i++)
				if(board[i][j]==word.charAt(0)) {
					boolean ans=Search(board,i,j,word);
					if(ans==true) {
						System.out.println(ans);
						return;
					}
				}
		}
	}
	public static boolean Search(char[][] board, int cr, int cc, String word,) {
		if(cc<0||cr<0||cc>=board[0].length||cr>=board.length||word.charAt(idx)!=board[cr][cc]) {
		return false;	
		}
		int[] r= {-1,0,1,0};
		int[] c= {0,-1,0,1};
		for(int k=0;k<c.length;k++) {
			
		}
	}

}
