package lecture_9;

public class Trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 3, 1, 7, 3, 4 };
		int[] left = left(arr);
		int[] rigth = right(arr);
		System.out.println(sum(arr, left, rigth));
	}

	public static int[] left(int[] arr) {
		int[] left = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < arr.length; i++)
			left[i] = Math.max(left[i - 1], arr[i]);
		return left;
	}

	public static int[] right(int[] arr) {
		int[] right = new int[arr.length];
		right[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);
		return right;
	}

	public static int sum(int[] arr, int[] left, int[] rigth) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += (Math.min(left[i], rigth[i]) - arr[i]);
		return sum;
	}
}
