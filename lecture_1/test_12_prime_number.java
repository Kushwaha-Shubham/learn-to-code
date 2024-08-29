package lecture_1;

public class test_12_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, i=2, b=0;
		while(i<=(n/2)) {
			if(n%i==0) {
			b++;
			break;
			}
			i++;
		}
		if(b==0)
			System.out.println("Prime number");
		else
			System.out.println("Not prime number");
	}

}
