package lecture_7;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 2;
		k = k % arr.length;
		rotate1(arr, k);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void rotate(int[] arr, int k) {
		for (int x = 0; x < k; x++) {
			for (int i = 0; i < arr.length - 1; i++) {
				int temp = arr[arr.length - 1];
				arr[arr.length - 1] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void rotate1(int[] arr, int k) {
		int n = arr.length;
		for (int j = 0; j < k; j++) {
			int temp = arr[n - 1];
			for (int i = n - 2; i >= 0; i--)
				arr[i + 1] = arr[i];
			arr[0] = temp;
		}
	}
}