package lecture_27;

import lecture_22.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		super.push(item);
	}

	public static void main(String[] args) throws Exception {
		Dynamic_Stack ds= new Dynamic_Stack();
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.push(6);
		ds.push(7);
		ds.Display();
	}
}