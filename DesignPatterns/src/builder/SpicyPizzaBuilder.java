package builder;

public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Pan baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("peperoni + salami");
	}

}
