package lecture_7;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 34, 56, 78, 11, -7, 90 };
		int item = 78;
		System.out.println(search(arr, item));
	}

	public static int search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item)
				return i;
		}
		return -1;
	}
}
