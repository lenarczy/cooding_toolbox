package prototype;

public class PrototypeImpl extends Prototype {
	
	private int x;
	
	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public void printX() {
		System.out.println(x);
	}

}
