package Ducks;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		// Real duck quacks
		System.out.println("Quack");
	}

}
