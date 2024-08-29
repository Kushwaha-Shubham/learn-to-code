package lecture_7;

public class arrays_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a;
		int []arr=new int[5];
		System.out.println(arr);
		System.out.println(arr[2]);
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int[] other=arr;
		System.out.println(other.length);
	}

}
