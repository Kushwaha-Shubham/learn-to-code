package lecture_10;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 15, 19 };
		int item = 11;
		System.out.println(search(arr, item));
	}

	public static int search(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item)
				return mid;
			else if (arr[mid] > item)
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		return -1;
	}
}
