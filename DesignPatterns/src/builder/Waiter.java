package builder;

public class Waiter {
	
	PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pb) {
		this.pizzaBuilder = pb;
	}
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza() {
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
	
	

}
