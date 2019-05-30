package testowy;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import k1.C1;
import k2.K2;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer i = -129;
		Integer j = -129;
		System.out.println(i == j ? "true":"false");
		method((byte)-120);
		C1 c1 = new C1();
		c1.method();
		c1 = new K2();
		c1.method();
		method(c1);*/
		C1 c1 = new C1();
		K2 k2 = new K2();
		System.out.println(k2 instanceof C1);
		System.out.println(c1.getClass() == k2.getClass());
		Locale loc = new Locale("pl","PL");
		System.out.println(loc.getDisplayCountry(new Locale("en","UK")));
		System.out.println(loc.getDisplayLanguage(new Locale("en","UK")));
		Scanner scaner = new Scanner("1 3 5 a 6 c");
		while(scaner.hasNext()) {
			if(scaner.hasNextInt()) {
				System.out.println(scaner.nextInt());
			} else 
				scaner.next();
		}
	}
	
	static void method(byte c) {
		byte b = 10;
		b = (byte)(b + c);
		System.out.println(b);
	}
	
	static void method(C1 c1) {
		System.out.println("I use methode with interface");
	}
	
	static void method(K2 k2) {
		System.out.println("I use method with class");
	}

}
