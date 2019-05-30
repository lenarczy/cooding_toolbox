package testowy;

public class Dog<T> implements Animal {
	
	private int speed;
	private int eatingSpeed;
	
	public Dog(int speed, int eatingSpeed) {
		this.speed = speed;
		this.eatingSpeed = eatingSpeed;
	}

	@Override
	public int legs() {
		return 4;
	}

	@Override
	public int ears() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int eyes() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double run(int far) {
		return Double.valueOf((double)far)/speed;
	}

	@Override
	public double eat() {
		return 0;
	}

}
