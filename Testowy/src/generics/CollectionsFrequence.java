package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,3,5,1,2,4,6,3,6,2,3);
		System.out.println(Collections.frequency(list, 3));

	}

}
