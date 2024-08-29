package lecture_7;

public class max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 34, 56, 100, 11, -7, 90 };
		System.out.println(max(arr));
		System.out.println(max1(arr));
	}

	public static int max(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++)
			temp = (arr[i] > temp) ? arr[i] : temp;
		return temp;
	}

	public static int max1(int[] arr) {
		int temp = Integer.MIN_VALUE; // -2^31
		for (int i = 0; i < arr.length; i++)
			temp = Math.max(temp, arr[i]);
		return temp;
	}
}
