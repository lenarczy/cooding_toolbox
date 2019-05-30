/*Write a function:

   class Solution { public int count_div(int A,int B,int K); }

that, given three integers A, B and K, returns the number of integers
within the range [A..B] that are divisible by K, i.e.:

   { i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return
3, because there are three numbers divisible by 2 within the range
[6..11], namely 6, 8 and 10.

Assume that:

       A is an integer within the range [0..2,147,483,647];
       B is an integer within the range [0..2,147,483,647];
       K is an integer within the range [1..2,147,483,647];
       A ≤ B.

Complexity:

       expected worst-case time complexity is O(1);
       expected worst-case space complexity is O(1).
*/
public class Third {
	
	public static int count_div( int A,int B,int K ) {
		if(A == B) {
			if(A % K ==0) return 1;
		}
		int count = 0;
		if(A == 0) count ++;
		count+= B/K;
		count += (A-1) / K;
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.nanoTime();
		System.out.println(count_div(0,10000,33));
		System.out.println(System.nanoTime()- start);
		start = System.nanoTime();
		System.out.println(count_div(2,14,2));
		System.out.println(System.nanoTime()- start);
	}

}
