/**
 * 
 */

/**
 * @author rafal
 *
 */
public class Fibionacci {
	
	static int power_fib(int N, int M) {
		if(N == 0) return 0;
		if(M == 0) return 1;
		int pow = (int)Math.pow((double)N, (double)M);
		long result = fib(pow);
		return Long.valueOf(result % 10000103L).intValue();
		
	}
	
	static long fib(long N) {
		long n_2 = 0;
		long n_1 = 1;
		long result = 0;
		for(long i = 2; i <= N; i++) {
			result = n_1 + n_2;
			n_2 = n_1;
			n_1 = result;
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(power_fib(10000000,10000000));
//		System.out.println(fib(10000000));

	}

}
