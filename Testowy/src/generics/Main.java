package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class Main {
	
	static int i = 0;
	
	public static void s(List<Number> os) {
		for(Number o : os) {
			System.out.println(o);
		}
	};
	
	public static void a(Object[] obs) {
		obs[0] = new String("aa");
	}
	
	public static void aa(List<Shape> shapes) {
		for(Shape s : shapes) {
			cc(s);
		}
	}
	
	public static void cc(Shape s) {
		if(s instanceof Circle) {
			System.out.println("is Circle "+s);
		} 
		if(s instanceof Rectangle) {
			System.out.println("is Rectangle "+s);
		}
		if(s instanceof Shape) {
			System.out.println("is Shape "+s);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Canvas c = new Canvas();
		c.drawAll(new ArrayList<Circle>());
		
		Shape[] ob = new Circle[2];
		Circle c1 = new Circle(1,1,5);
		Circle c2 = new Circle(2,2,10);
		Rectangle r1 = new Rectangle(1,1,24,12);
		Shape s1 = new Shape() {

			@Override
			public void draw(Canvas cs) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String toString() {
				return "It is shape";
			}
			
		};
		cc(c1);
		cc(c2);
		cc(r1);
		cc(s1);
		
		List<String> list = new ArrayList<String>();
		List<Integer> listInt = new ArrayList<Integer>();
		Executor ex = Executors.newFixedThreadPool(3, Executors.defaultThreadFactory());
		ex.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println(Thread.currentThread().getName()+" get i "+getInt());
				}
			}
		});
		
		ex.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println(Thread.currentThread().getName()+" setInt ");
					setInt();
				}
			}
		});
		
	}
	
	public synchronized static int getInt() {
		try {
			TimeUnit.SECONDS.sleep(5);
			Main.class.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public synchronized static void setInt() {
		i++;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Main.class.notify();
	}

}
