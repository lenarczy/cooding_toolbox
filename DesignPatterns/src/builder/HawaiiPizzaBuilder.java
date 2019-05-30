package builder;

public class HawaiiPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("cross");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham+pinaple");
	}
}
