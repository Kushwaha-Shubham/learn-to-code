package lecture_7;

public class reversal_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		k = k % arr.length;
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
