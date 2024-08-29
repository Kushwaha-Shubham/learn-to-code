package lecture_20;

public class Sort_Array_Using_Divide_Conquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 7, 3, 2, 1 };
		int[] ans = sort(arr, 0, arr.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + ei) / 2;
		int[] fs = sort(arr, si, mid);
		int[] ss = sort(arr, mid + 1, ei);
		return Merge(fs, ss);
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
