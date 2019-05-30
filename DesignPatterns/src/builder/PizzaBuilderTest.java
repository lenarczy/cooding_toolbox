package builder;

public class PizzaBuilderTest {
	
	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiBuilder = new HawaiiPizzaBuilder();
		waiter.setPizzaBuilder(hawaiBuilder);
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
		
	}

}
