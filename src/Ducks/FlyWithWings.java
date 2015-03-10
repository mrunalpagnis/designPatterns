package Ducks;

public class FlyWithWings implements FlyingBehavior {

	@Override
	public void fly() {
		// true duck flies with natural wings
		System.out.println("Flying with Wings");
	}

}
