package icecreamShop;

public class Strawberry extends IcecreamDecorator{
	Icecream icecream;
	Strawberry(Icecream ice)
	{
		icecream = ice;
	}
	public String makeIcecream(){
		return icecream.makeIcecream() + addStrawberry();
	}
	String addStrawberry(){
		return " strawberry added";
	}
}
