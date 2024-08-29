package lecture_11;

public class horizontal_wave_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 11, 12, 13, 14 }, { 10, 20, 30, 40 } };
		Wave(arr);
	}

	public static void Wave(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[0].length; col++)
					System.out.print(arr[row][col] + " ");
			} else {
				for (int col = arr[0].length - 1; col >= 0; col--)
					System.out.print(arr[row][col] + " ");
			}
		}
	}
}
