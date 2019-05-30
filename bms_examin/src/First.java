/*A non-empty zero-indexed array A consisting of N integers is given. A
pair of integers (P, Q) is called K-complementary in array A if 0 ≤ P,
Q < N and A[P] + A[Q] = K.

For example, consider array A such that

   A[0] =  1  A[1] = 8  A[2]= -3
   A[3] =  0  A[4] = 1  A[5]=  3
   A[6] = -2  A[7] = 4  A[8]=  5

The following pairs are 6-complementary in array A: (0,8), (1,6),
(4,8), (5,5), (6,1), (8,0), (8,4). For instance, the pair (4,8) is
6-complementary because A[4] + A[8] = 1 + 5 = 6.

Write a function

   class Solution { public int complementary_pairs(int K,int[] A); }

that, given an integer K and a non-empty zero-indexed array A
consisting of N integers, returns the number of K-complementary pairs
in array A.

Assume that:

       N is an integer within the range [1..50,000];
       K is an integer within the range [−2,147,483,648..2,147,483,647];
       each element of array A is an integer within the range
[−2,147,483,648..2,147,483,647].

For example, given K = 6 and array A such that

   A[0] =  1  A[1] = 8  A[2]= -3
   A[3] =  0  A[4] = 1  A[5]=  3
   A[6] = -2  A[7] = 4  A[8]=  5

the function should return 7, as explained above.

Complexity:

       expected worst-case time complexity is O(N*log(N));
       expected worst-case space complexity is O(N), beyond input
storage (not counting the storage required for input arguments).
*/


import java.util.Random;

public class First {
	
	public static int extreme ( int[] A ) {
	      if(A == null || A.length == 0) return -1;
	      int sum = 0;
	      boolean initialized = false;
	      for(int i = 0; i < A.length; i ++) {
	    	  if(A[i] != 0) initialized = true;
	    	  sum +=A[i];
	      }
	      if(!initialized) return -1;
	      float avg = (float)sum/A.length;
	      float max = Math.abs(A[0]-avg);
	      int index = 0;
	      float maxTmp = 0;
	      for(int i =1; i < A.length; i++) {
	    	  if((maxTmp = Math.abs(A[i]-avg))>max) {
	    		  index = i;
	    		  max = maxTmp; 
	    	  }
	      }
	      return index;
	      
	  }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		int[] tab = new int[10];//new int[1000000];
//		for (int i = 0; i < tab.length; i++) {
//			tab[i] = r.nextInt(Integer.MAX_VALUE);
//		}
//		int [] tab = {9,4,-3,-10};
		System.out.println(extreme(tab));
	}

}
