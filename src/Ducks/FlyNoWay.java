package Ducks;

public class FlyNoWay implements FlyingBehavior {

	@Override
	public void fly() {
		// artificial ducks without wings cannot fly
		System.out.println("Do no Fly");
	}

}
