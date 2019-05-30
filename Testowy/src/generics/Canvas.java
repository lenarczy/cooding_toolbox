package generics;

import java.util.List;

public class Canvas {
	
	public void draw(Shape s) {
		s.draw(this);
	}
	
	public void drawAll(List<? extends Shape> ss) {
		for(Shape s : ss) {
			s.draw(this);
		}
	}
	// applicable to - odpowiedni do, majacy zastosowanie
	public void fill(List<? extends Shape> ss) {
//		ss.add(new Shape() {
//			public void draw(Canvas c) {};
//		});
	}
	
	public <T> void fillListFromArray(T[] tab, List<T> list) {
		for(T t : tab) {
			list.add(t);
		}
	}
	
	
}
