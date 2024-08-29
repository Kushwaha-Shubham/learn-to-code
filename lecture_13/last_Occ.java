package lecture_13;

public class last_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 1, 7, 8, 1, 6, 1, 78 };
		int item = 1;
		System.out.println(find(arr, item, arr.length-1));
	}

	public static int find(int[] arr, int item, int i) {
		if (i == -1)
			return -1;
		if (arr[i] == item)
			return i;
		return find(arr, item, i - 1);
	}
}
