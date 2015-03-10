package PizzaShop;

public class ChicagoStore extends pizzaStore {
	Pizza pizza;
	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type == "Chicken")
			pizza = new ChicagoChickenPizza();
		else
			pizza = new ChicagoCheesePizza();
		return pizza;
	}

}
