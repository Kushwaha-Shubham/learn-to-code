package lecture_26;

import java.util.*;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 13, 21, 3 };
	}

	public static void NGE(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
	}
}
