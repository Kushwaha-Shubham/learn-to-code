package lecture_8;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 5, 7, 8, 2 };
		sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++)
			insertion(arr, arr[i], i - 1);
	}

	public static void insertion(int[] arr, int item, int i) {
		while (i >= 0 && arr[i] > item) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = item;
	}
}
