package prototype;

public class PrototypeTest {
	
	public static void main(String[] args) {
		Prototype prototype = new PrototypeImpl();
		prototype.setX(1000);
		for(int i=0; i < 10; i ++) {
			try {
				Prototype prototypeTmp = prototype.clone();
				prototypeTmp.setX(prototypeTmp.getX()*i);
				prototypeTmp.printX();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
