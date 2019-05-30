
public class HeavyNumbers {
	
	public static int heavy_decimal_count(int A, int B) {
		
		if(A > B) {
			int tmp = A;
			A = B;
			B = tmp;
		}
		if(A < 8) {
			if(B < 8) return 0;
			else A = 8;
		}
		int counter = 0;
		for(int i = A; i <= B; i ++) {
			if(average(i) > 7) {
				counter ++;
			}
		}
		return counter;
	}
	
	static float average(int A) {
		String s = Integer.toString(A);
//		char[] chArr = s.toCharArray();
		float a = 0;
		int length = s.length();
		for(int i = 0; i < length; i ++) {
			a+= Character.digit(s.charAt(i), 10);
		}
		return a/length;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		System.out.println(heavy_decimal_count(0,200000000));
		System.out.println(System.currentTimeMillis()-start);
		System.out.println(Math.ulp(1));
		
//		593794			
//		68264	72334	46493	46169
		
		
	}

}
