package Ducks;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		MallardDuck m_duck = new MallardDuck();
		m_duck.performFly();
		m_duck.performQquack();
		m_duck.swim();
		m_duck.display();
	}

}
