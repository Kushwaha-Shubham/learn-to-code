package lecture_20;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 6, 7, 8, 9 };
		int[] arr2 = { 1, 3, 6, 8, 11, 12, 13, 14 };
		int[] arr = Merge(arr1, arr2);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public static int[] Merge(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;
			} else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
		return arr;
	}
}
