package PizzaShop;

public class ChicagoCheesePizza extends Pizza {
	ChicagoCheesePizza()
	{
		name  = "Cheese";
		sause = "BBQ";
		size = "Large";
	}
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("preparing "+name+" Pizza");
	}

}
