package PizzaShop;

public class ChicagoChickenPizza extends Pizza {

	ChicagoChickenPizza()
	{
		name = "chicago chicken pizza";
		sause = "BBQ";
		size = "large";
	}
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("preparing...");
	}

}
