package generics;

public class Rectangle implements Shape {

	int x,y,height, width;
	
	public Rectangle(int... params) {
		this.x = params[0];
		this.y = params[1];
		this.height = params[2];
		this.width = params[3];
	}
	@Override
	public void draw(Canvas cs) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", height=" + height
				+ ", width=" + width + "]";
	}
	
	

}
