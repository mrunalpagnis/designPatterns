package icecreamShop;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream ice = new Strawberry(new VanillaIcecream());
		ice = new Strawberry(ice);
		System.out.println(ice.makeIcecream());
	}

}
