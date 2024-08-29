package lecture_9;

public class product_of_array_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[] left = left(arr);
		int[] rigth = right(arr);
		arr = product(left, rigth);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] left(int[] arr) {
		int[] left = new int[arr.length];
		left[0] = 1;
		for (int i = 1; i < arr.length; i++)
			left[i] = left[i - 1] * arr[i-1];
		return left;
	}

	public static int[] right(int[] arr) {
		int[] right = new int[arr.length];
		right[arr.length - 1] = 1;
		for (int i = arr.length - 2; i >= 0; i--)
			right[i] = right[i + 1] * arr[i+1];
		return right;
	}

	public static int[] product(int[] left, int[] rigth) {
		int[] arr = new int[left.length];
		for (int i = 0; i < arr.length; i++)
			arr[i] = left[i] * rigth[i];
		return arr;
	}
}
