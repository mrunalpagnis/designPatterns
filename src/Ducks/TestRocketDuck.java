package Ducks;

public class TestRocketDuck {

	public static void main(String[] args) {
		ModelDuck m_duck = new ModelDuck();
		m_duck.performFly();
		m_duck.setFlyingBehavior(new FlyWithRocketWings());
		m_duck.performFly();
	}

}
