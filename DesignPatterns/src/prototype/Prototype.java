package prototype;

public abstract class Prototype implements Cloneable {

	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		return (Prototype)super.clone();
	}
	
	public abstract int getX();
	public abstract void setX(int x);
	public abstract void printX();	

}
