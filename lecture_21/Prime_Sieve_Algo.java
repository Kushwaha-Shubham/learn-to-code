package lecture_21;

public class Prime_Sieve_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		Prime(n);
	}

	public static void Prime(int n) {
		boolean[] prime = new boolean[n + 1];
		for (int i = 2; i < prime.length; i++)
			prime[i] = true;
		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == true) {
				for (int j = 2; j * i < prime.length; j++)
					prime[j * i] = false;
			}
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}
}
