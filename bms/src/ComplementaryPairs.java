import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 */

/**
 * @author rafal
 *
 */
public class ComplementaryPairs {
	
	static long complementary_pairs(int K, int[] A) {
		Map<Integer, List<Integer>> map = new HashMap<Integer,List<Integer>>();
		for(int i = 0; i < A.length; i ++) {
			int result = K - A[i];
			List<Integer> list;
			list = map.get(result);
			if(list==null) {
				list = new ArrayList<Integer>();
				map.put(result, list);
			}
			list.add(i);
		}
		long licznik = 0;
		for(int i = 0; i < A.length; i ++) {
			List<Integer> list = map.get(A[i]);
			if(list != null) licznik+=list.size();
		}
		return licznik;
	}
	
	public static int complementary_pairs2 ( int K,int[] A ) {
		int licznik =0;
		for(int i=0; i < A.length;i++){
			for(int j=0 ;j < A.length;j++){
				if(A[i]+A[j]==K){
					licznik++;
				}
			}
		}
		return licznik;

	  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random(System.currentTimeMillis());
		int licznik = 0;
		int[] tab = new int[20000000];
		while(licznik < tab.length) {
			tab[licznik] = r.nextInt(10);
			licznik ++;
		}
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i = 0; i < tab.length; i ++) {
//			list.add(tab[i]);
//		}
//		System.out.println(list);
		int[]A={1,8,-3,0,1,3,-2,4,5};
		int K=6;
		long start = System.currentTimeMillis();
		 System.out.println("aa"+complementary_pairs(K, tab));
		System.out.println(System.currentTimeMillis() - start);
	}

}
