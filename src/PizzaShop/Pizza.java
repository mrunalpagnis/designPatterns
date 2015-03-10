package PizzaShop;

public abstract class Pizza {
	String name;
	String sause;
	String dough;
	String size;
	void bake()
	{
		System.out.println("baking");
	}
	void cut()
	{
		System.out.println("cutting");
	}
	void box()
	{
		System.out.println("packing");
	}
	abstract void prepare();
}
