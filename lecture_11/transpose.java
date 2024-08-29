package lecture_11;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 10, 20, 30, 40 }, { 40, 5, 70, 9 }, { 8, 11, 88, 69 }, { 70, 73, 72, 75 } };
		transpose_array(arr);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++)
				System.out.print(arr[row][col] + " ");
			System.out.println();
		}
	}

	public static int[][] transpose_array(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr[0].length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;
			}
		}
		return arr;
	}
}
