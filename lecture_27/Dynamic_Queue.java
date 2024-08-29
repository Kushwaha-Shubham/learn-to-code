package lecture_27;

import lecture_22.Queue;

public class Dynamic_Queue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			int[] newarr = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front + 1) % arr.length;
				newarr[i] = arr[idx];
			}
			arr = newarr;
			front = 0;
		}
		super.Enqueue(item);
	}

	public static void main(String[] args) throws Exception {
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Display();
	}
}
