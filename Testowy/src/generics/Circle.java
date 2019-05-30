package generics;

public class Circle implements Shape {
	
	int x,y, radius;
	
	public Circle(int... datas) {
		this.x = datas[0];
		this.y = datas[1];
		this.radius = datas[2];
	}

	@Override
	public void draw(Canvas cs) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString() {
		return String.format("Circle with center in %d,%d and radius %d",x,y,radius);
	}

}
